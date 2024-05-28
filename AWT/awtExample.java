import java.awt.*;
public class awtExample extends Frame{
     awtExample()
     {
          Button b = new Button("Click me ...!");
          b.setBounds(30,20,100,30);
          add(b);
          setSize(200,200);
          setTitle("This is my example");
          setLayout(null);
          setVisible(true);
     }
     public static void main(String[] args) {
          awtExample F = new awtExample();
     }
}
