import java.awt.event.*;
import javax.swing.*;
class Swing_Radiobutton extends JFrame implements ActionListener
{
	JRadioButton rb1,rb2,rb3;
	JButton b1;
	Swing_Radiobutton()
	{
		rb1=new JRadioButton("Male");
		rb1.setBounds(50,70,50,30);

		rb2=new JRadioButton("Female");
		rb2.setBounds(50,120,50,30);

		rb3=new JRadioButton("Others");
		rb3.setBounds(50,170,50,30);

		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1); bg.add(rb2); bg.add(rb3);

		b1=new JButton("Click Me");
		b1.setBounds(50,220,100,30);

		b1.addActionListener(this);
		add(rb1); add(rb2); add(rb3); add(b1);
		setLayout(null);
		setTitle("Application Settings");
		setVisible(true);
		setSize(500,500);
		
	}
	public void actionPerformed(ActionEvent E){
		if(rb1.isSelected())
		{
			JOptionPane.showMessageDialog(this, "Your Gender is Male");
		}
		if(rb2.isSelected())
		{
			JOptionPane.showMessageDialog(this,"Your gender is :- Femle");
		}
		if(rb3.isSelected())
		{
			// JOptionPane.showMessageDialog(this , "your gender is :- Other");
		}
	// }
	public static void main(String[] args) {
		// // Swing_Radiobutton  swing_Radiobutton= new Swing_Radiobutton(); 
	}
}