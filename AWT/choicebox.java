import  java.awt.*;
import java.awt.event.*;

public class choicebox {
     choicebox()
     {
          Frame f = new Frame("Choice Box");
          Label L=new Label();
          L.setAlignment(Label.CENTER);
          L.setSize(400,100);

          Button b = new Button("show");
          b.setBounds(250,150,50,30);

          Choice choice = new Choice();
          choice.setBounds(90,150,70,70);
          choice.add("C++");
          choice.add("C");
          choice.add("Python");
          choice.add(".Net");
          choice.add("PHP");
          choice.add("Android");
          choice.add("JAVA");
          choice.add("Javascript");
          choice.add("Ruby");
          f.add(choice);
          f.add(L);
          f.add(b);
          f.setSize(500,500);
          f.setLayout(null);
          f.setVisible(true);
     
     b.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) 
          {
               String data = "Language Selected: " +choice.getItem(choice.getSelectedIndex());
               L.setText(data);
          }
     } );
}
     public static void main(String[] args) {
          new choicebox();
     }
}
