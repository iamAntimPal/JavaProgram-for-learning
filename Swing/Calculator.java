
// creating a new instance calculater using Swing with constructor 
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import javax.script.*;

public class Calculator extends JFrame implements ActionListener {
      JLabel L1;
      JTextField T1;
      JButton B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17;
      String s0 = "", s1 = "", s = "";

      Calculator() {
            L1 = new JLabel("Calculator");
            L1.setBounds(50, 25, 100, 30);

            T1 = new JTextField();
            T1.setBounds(50, 60, 200, 30);

            B1 = new JButton("1");
            B1.setBounds(50, 95, 45, 40);

            B2 = new JButton("2");
            B2.setBounds(100, 95, 45, 40);

            B3 = new JButton("3");
            B3.setBounds(150, 95, 45, 40);

            B4 = new JButton("+");
            B4.setBounds(200, 95, 45, 40);

            B5 = new JButton("4");
            B5.setBounds(50, 140, 45, 40);

            B6 = new JButton("5");
            B6.setBounds(100, 140, 45, 40);

            B7 = new JButton("6");
            B7.setBounds(150, 140, 45, 40);

            B8 = new JButton("-");
            B8.setBounds(200, 140, 45, 40);

            B9 = new JButton("7");
            B9.setBounds(50, 185, 45, 40);

            B10 = new JButton("8");
            B10.setBounds(100, 185, 45, 40);

            B11 = new JButton("9");
            B11.setBounds(150, 185, 45, 40);

            B12 = new JButton("x");
            B12.setBounds(200, 185, 45, 40);

            B13 = new JButton("0");
            B13.setBounds(50, 230, 45, 40);

            B14 = new JButton("/");
            B14.setBounds(100, 230, 45, 40);

            B15 = new JButton("%");
            B15.setBounds(150, 230, 45, 40);

            B16 = new JButton("=");
            B16.setBounds(200, 230, 45, 40);

            B17 = new JButton("C");
            B17.setBounds(200, 300, 45, 40);

            add(B1);
            add(B2);
            add(B3);
            add(B4);
            add(B5);
            add(B6);
            add(B7);
            add(B8);
            add(B9);
            add(B10);
            add(B11);
            add(B12);
            add(B13);
            add(B14);
            add(B15);
            add(B16);
            add(B17);
            add(L1);
            add(T1);
            B1.addActionListener(this);
            B2.addActionListener(this);
            B3.addActionListener(this);
            B4.addActionListener(this);
            B5.addActionListener(this);
            B6.addActionListener(this);
            B7.addActionListener(this);
            B8.addActionListener(this);
            B9.addActionListener(this);
            B10.addActionListener(this);
            B11.addActionListener(this);
            B12.addActionListener(this);
            B13.addActionListener(this);
            B14.addActionListener(this);
            B15.addActionListener(this);
            B16.addActionListener(this);
            B17.addActionListener(this);

            // setBackground(Color.BLACK);
            setSize(300, 400);
            setTitle("Calculator Application");
            setLayout(null);
            setVisible(true);
      }

      public void actionPerformed(ActionEvent E) {
            String s = E.getActionCommand();
            // System.out.println(s);

            // System.out.println(s);
            switch (s) {
                  case "0":
                        s0 = s0 + s;
                        T1.setText(s0);
                        break;
                  case "1":
                        s0 = s0 + s;
                        T1.setText(s0);
                        break;
                  case "2":
                        s0 = s0 + s;
                        T1.setText(s0);
                        break;
                  case "3":
                        s0 = s0 + s;
                        T1.setText(s0);
                        break;
                  case "4":
                        s0 = s0 + s;
                        T1.setText(s0);
                        break;
                  case "5":
                        s0 = s0 + s;
                        T1.setText(s0);
                        break;
                  case "6":
                        s0 = s0 + s;
                        T1.setText(s0);
                        break;
                  case "7":
                        s0 = s0 + s;
                        T1.setText(s0);
                        break;
                  case "8":
                        s0 = s0 + s;
                        T1.setText(s0);
                        break;
                  case "9":
                        s0 = s0 + s;
                        T1.setText(s0);
                        break;
                  case "+":
                        s0 = s0 + s;
                        T1.setText(s0);
                        break;
                  case "-":
                        s0 = s0 + s;
                        T1.setText(s0);
                        break;
                  case "x":
                        s0 = s0 + "*";
                        T1.setText(s0);
                        break;
                  case "/":
                        s0 = s0 + s;
                        T1.setText(s0);
                        break;
                  case "%":
                        s0 = s0 + s;
                        T1.setText(s0);
                        break;
                  case "=":
                        System.out.println("uiui");
                        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
                        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
                        try {
                              Object ob = scriptEngine.eval(s0);

                              s0 = String.valueOf(ob);
                        } catch (Exception ae) {
                              System.out.println("Error"+ae);
                        }
                        ;
                        T1.setText(s0);
                        break;
                  case "C":
                        T1.setText("");
                        s0 = "";
            }

      }

      public static void main(String[] args) {
            Calculator F = new Calculator();
      }

}
