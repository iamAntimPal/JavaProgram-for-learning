// Swing_List
import javax.swing.*;
import java.awt.event.*;
class Swing_List 
{
	Swing_List()
	{
		JFrame F=new JFrame();
		JLabel L1=new JLabel();
		L1.setSize(500,100);
		JButton B=new JButton("click me");
		B.setBounds(200,150,80,30);

		DefaultListModel<String> L2=new DefaultListModel<>();
		L2.addElement("C");
		L2.addElement("C++");
		L2.addElement("Python");
		L2.addElement(".NET");
		L2.addElement("Ruby");
		L2.addElement("HTML");
		L2.addElement("JavaScript");
		L2.addElement("Java");

		JList<String>lst=new JList<>(L2);
		lst.setBounds(100,100,75,75);
		F.add(L1); F.add(lst);
		F.add(B1);
		F.setSize(500,500);
		F.setTitle("Application of List");
		F.setLayout(null);
		F.setVisible(true);

		B.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent E)
			{
				String Data="";
				if(lst.getSelectedIndex()!=-1)
				{
					Data="Proigraming Language :-"+lst.getSelectedIndex();
					L1.setText(Data);
				}
			}
		});
	}
	public static void main(String[] args) {
		Swing_List sw=new Swing_List();
	}
}