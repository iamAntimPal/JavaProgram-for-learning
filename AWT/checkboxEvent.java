import java.awt.*;
import java.awt.event.*;
public class checkboxEvent
{
     checkboxEvent()
     {
          Frame F=new Frame();
          Label L=new Label("Lebel");
          L.setBounds(0,0,200,50);
          // CheckboxGroup CBG=new CheckboxGroup();
          Checkbox C1=new Checkbox("Male",true);
          C1.setBounds(50,40,100,30);
          Checkbox C2=new Checkbox("Female",false);
          C2.setBounds(50,80,100,30);
          F.add(C1);
          F.add(C2);
          F.setSize(300,300);
          F.setLayout(null);
          F.setVisible(true);
     
     C1.addItemListener(new ItemListener()
     {
          public void itemStateChanged(ItemEvent e)
          {
               if(e.getSource()==C1)
               {
                    System.out.println("Male");
               }
               if(e.getSource()==C2)
               {
                    System.out.println("Female");
               }
          }
     });
     C2.addItemListener(new ItemListener() {
          public void itemStateChanged(ItemEvent e) {
               if (e.getSource() == C1) {
                    System.out.println("Male");
               }
               if (e.getSource() == C2) {
                    System.out.println("Female");
               }
          }
     });
}
     public static void main(String[] args) 
     {
          checkboxEvent ch=new checkboxEvent();
     }
}
