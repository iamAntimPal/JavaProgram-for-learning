import java.awt.*;

public class awtExample1 {
     awtExample1() {
          Frame F=new Frame();
          Label L=new Label("School Admission From");
          L.setBounds(50,40,100,30);
          Label L = new Label("School Admission From");
          L.setBounds(30, 80, 50, 30);
          TextField T=new TextField();
          T.setBounds(90,80,30,50);
          Button B=new Button("Subit");
          B.setBounds(50,120,40,40);

          Button b = new Button("Click me ...!");
          b.setBounds(30, 20, 100, 30);
          F.add(L);
          F.setSize(200,200);
          F.add(b);
          F.setSize(200, 200);
          F.setTitle("This is my example");
          F.setLayout(null);
          F.setVisible(true);
     }

     public static void main(String[] args) {
          awtExample1 F = new awtExample1();
     }
}
