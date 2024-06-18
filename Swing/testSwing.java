//Swing Application without inheriting Frame without constructor 

import javax.swing.*;
class testSwing{
	public static void main(String[] args) {
		JFrame F=new JFrame();
		F.setLayout(null);
		F.setTitle("First Swing Application");
		JLabel L1=new JLabel("Employee Name");
		L1.setBounds(30,70,80,30);

		JTextField TF=new JTextField();
		TF.setBounds(300,300,80,30);

		JButton B1=new JButton("Click me");
		B1.setBounds(30,120,80,30);

		F.add(B1);
		F.add(L1);
		F.add(TF);

		F.setSize(500,500);
		F.setVisible(true);
		
		
	}
}


// Swing Application by inheriting Frame and with construtor
/*
import javax.swing.*;

class testSwing2 extends JFrame
{
	testSwing2()
	{
		JFrame F=new JFrame();
		JLabel L1=new JLabel("Employee Name");
		L1.setBounds(30,70,80,30);

		JTextField TF=new JTextField();
		TF.setBounds(0,0,80,30);

		JButton B1=new JButton("Click me");
		B1.setBounds(30,120,80,30);

		add(B1);
		add(L1);
		add(TF);

		setSize(500,500);
		setVisible(true);
		setLayout(null);
		setTitle("First Swing Application");
	}
	public static void main(String[] args) {
		testSwing2 ts=new testSwing2();
	}
}
*/

// Swing Application by inheriting Frame with constructor 
/*
import javax.swing.*;
import java.awt.event.*;	
class testSwing3 extends JFrame implements ActionListener
{

	JLabel L1,L2;
	JButton B1;
	JTextArea area;
	testSwing3()
	{
		L1=new JLabel();
		L1.setBounds(50,25,100,30);
		L2=new JLabel();
		L2.setBounds(160,25,100,30);

		area=new JTextArea();
		area.setBounds(20,75,250,200);

		B1=new JButton("Click me ");
		B1.setBounds(100,300,120,30);

		B1.addActionListener(this);

		add(B1);
		add(L1);
		add(L2);
		add(area);

		setSize(500,500);
		setTitle("Application");
		setLayout(null);
		setVisible(true);

		
	}
	public void actionPerformed(ActionEvent E)
		{
			String text=area.getText();
			String words[]=text.split("\\s");
			L1.setText("words :-"+ words.length);
			L2.setText("Text Length"+text.length());
		}	
	public static void main(String[] args) {
		testSwing3 ts=new testSwing3();
	}
}
*/