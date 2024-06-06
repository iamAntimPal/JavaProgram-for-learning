import java.awt.*;
class checkbox
{    checkbox()
     {
          Frame f = new Frame();
          f.setSize(500, 500);
          f.setVisible(true);
          f.setLayout(null);
          f.setTitle("Check Box");
          CheckboxGroup opt=new CheckboxGroup();
          CheckboxGroup gender=new CheckboxGroup();

          Label L1 = new Label("DO you want Bonus?");
          L1.setBounds(100, 70, 150, 30);
          f.add(L1);

          Checkbox c1 = new Checkbox("Yes",false,opt);
          c1.setBounds(100, 100,50, 20);
          f.add(c1);

          Checkbox c2 = new Checkbox("No", false,opt);
          c2.setBounds(180, 100,50, 20);
          f.add(c2);

          Label L2=new Label("Gender");
          L2.setBounds(100,140,50,20);
          f.add(L2);

          Checkbox c3=new Checkbox("male",false,gender);
          c3.setBounds(100,170,50,20);
          f.add(c3);

          Checkbox c4=new Checkbox("Female",false);
          c4.setBounds(160,170,80,20);
          f.add(c4);


     }
     public static void main(String[] args) {
          checkbox c=new checkbox();
              
     }
}