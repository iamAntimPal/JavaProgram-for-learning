//JCombobox 
/*
import java.awt.*;
import javax.swTing.*;
class Swing_Combobox
{
	JFrame F;

	Swing_Combobox()
	{
		F=new JFrame("comboBox");
		JLabel L1=new JLabel();
		L1.setHorizontalAlignmant(JLabel.CENTER);
		L1.setSize(400,100);
		JButton B1=new JButton("Click Me");
		B1.setbounds(300,70,100,30);

		String Language[]={"C++","C","Java","Python","PHP",".NET","Ruby","Django","Silenuim"};
		JComboBox CB1=new JComboBox(Language);
		CB1.setbounds(50,70,75,20);

		F.add(CB1);F.add(L1);F.add(B1);

		F.setSize(500,500);
		F.setVisible(true);
		F.setLayout(null);
		F.setTitel("Application of Combobox");

		B1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent E)
			{
				String Data="Selected progremming Language :-"+CB1.getItemAt(CB1.getSelectIndex());
				L1.setText(Data);
			}
		});
	}
	public static void main(String[] args) {
		Swing_Combobox sw=new Swing_Combobox();
	}
}
*/
import javax.swing.*;
import java.awt.event.*;
class swingComboBox 
{
	JFrame F;
	swingComboBox ()
	{
		F=new JFrame("comboBox");
		JLabel l1=new JLabel();
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setSize(400,100);

		JButton b1=new JButton("Click Me");
		b1.setBounds(300,70,100,30);

		String Language[]={"C++","C","Java","Python","PHP",".NET","Ruby","Django","Silenuim"};

		JComboBox cb1=new JComboBox(Language);
		cb1.setBounds(50,70,75,20);

		F.add(l1);F.add(b1);F.add(cb1);
		F.setLayout(null);
		F.setSize(500,500);
		F.setVisible(true);

		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent E){
				String Data="Selected Programming Language:-"+cb1.getItemAt(cb1.getSelectedIndex());
				l1.setText(Data);
			}
		});
	}
	public static void main(String[] args) {
		swingComboBox cb=new swingComboBox ();
	}
}
