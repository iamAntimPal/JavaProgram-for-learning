
//Swing Application by inheriting Frame and with constructor
import javax.swing.*;
import java.awt.event.*;

public class testSwing3 extends JFrame implements ActionListener {
     JLabel L1, L2;
     JTextArea area;
     JButton B;

     testSwing3() {
          L1 = new JLabel();
          L1.setBounds(50, 25, 100, 30);

          L2 = new JLabel();
          L2.setBounds(160, 25, 100, 30);

          area = new JTextArea();
          area.setBounds(20, 75, 250, 200);

          JButton B = new JButton("Click ME for count");
          B.setBounds(100, 300, 120, 30);

          B.addActionListener(this);

          add(B);
          add(L1);
          add(area);

          setSize(300, 300);
          setTitle("First AWt Application");
          setLayout(null);
          setVisible(true);
     }

     public void actionPerformed(ActionEvent E) {
          String text = area.getText();
          String words[] = text.split("\\s");
          L1.setText("Words:-" + words.length);
          L2.setText("Text Length:-" + text.length());
     }

     public static void main(String[] args) {
          testSwing3 ts = new testSwing3();
     }
}
/*
 * TextField
 * 1 2 3 +
 * 4 5 6 -
 * 7 8 9 *
 * 0 / % =
 */
/*
 * 1. JTextArea()
 * 2. JTextArea(String s)
 * 3. JTextArea(int row, int col)
 * 4. JTextArea(String s,int row, int col)
 * 
 * Commonly used methods
 * 1. void setRows(int row)
 * 2. void setColumns(int cols)
 * 3. void setFont(Font f)
 * 4. void insert(String s, int position)
 * 5. void append(String s)
 */
