import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.*;

public class Calc extends JFrame implements ActionListener {
     private JLabel L1;
     private JTextField T1;
     private JButton[] buttons;
     private String s0 = "";

     Calc() {
          L1 = new JLabel("Calculator");
          L1.setBounds(50, 25, 100, 30);

          T1 = new JTextField();
          T1.setBounds(50, 60, 200, 30);

          buttons = new JButton[17];
          String[] buttonLabels = {
                    "1", "2", "3", "+",
                    "4", "5", "6", "-",
                    "7", "8", "9", "x",
                    "0", "/", "%", "=",
                    "C"
          };

          int x = 50, y = 95;
          for (int i = 0; i < buttons.length; i++) {
               buttons[i] = new JButton(buttonLabels[i]);
               buttons[i].setBounds(x, y, 45, 40);
               buttons[i].addActionListener(this);
               add(buttons[i]);

               x += 50;
               if ((i + 1) % 4 == 0) {
                    x = 50;
                    y += 45;
               }
          }

          add(L1);
          add(T1);

          setSize(300, 400);
          setTitle("Calculator Application");
          setLayout(null);
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

     public void actionPerformed(ActionEvent E) {
          String s = E.getActionCommand();

          if (s.charAt(0) >= '0' && s.charAt(0) <= '9' || s.equals(".")) {
               s0 += s;
               T1.setText(s0);
          } else if (s.equals("=")) {
               ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
               ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
               try {
                    Object result = scriptEngine.eval(s0.replaceAll("x", "*"));
                    s0 = result.toString();
               } catch (Exception ae) {
                    s0 = "Error";
               }
               T1.setText(s0);
          } else if (s.equals("C")) {
               s0 = "";
               T1.setText(s0);
          } else {
               s0 += s;
               T1.setText(s0);
          }
     }

     public static void main(String[] args) {
          new Calculator();
     }
}
