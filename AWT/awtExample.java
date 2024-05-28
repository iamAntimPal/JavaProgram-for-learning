import java.awt.*;
public class awtExample extends Frame{
     awtExample()
     {
          Button b = new Button("Click me ...!");
          b.setBounds(30,40,100,30);
          add(b);
          b.setBackground(Color.BLUE);
          setSize(200,200);
          setTitle("This is my example");
          setLayout(null);
          setVisible(true);
     }
     public static void main(String[] args) {
          awtExample F = new awtExample();
     }
}
