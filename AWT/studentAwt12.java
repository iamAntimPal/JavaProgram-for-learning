
//By association Frame class
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * studentAwt
 */
class studentAwt12 implements ActionListener 
{
     TextField T1;
     studentAwt12() {
          Frame F = new Frame();
          Label L1 = new Label("School Admission From");
          L1.setBounds(100, 40, 250, 30);

          Label L2 = new Label("Student Name ");
          L2.setBounds(50, 80, 100, 30);

          TextField T = new TextField();
          T.setBounds(150, 80, 150, 30);

          Button B = new Button("Subit");
          B.setBounds(120, 130, 100, 30);

          F.setBackground(Color.red);
          F.add(L1);
          F.add(L2);
          F.add(T);
          F.add(B);
          F.setSize(400, 400);
          F.setTitle("Student Form");
          F.setLayout(null);
          F.setVisible(true);
          
     }
     
     public void actionperformed(ActionEvent e) {
          T1.setText("hello Java");
     }
     
     public static void main(String[] args) {
          studentAwt12 s = new studentAwt12();

     }

}
