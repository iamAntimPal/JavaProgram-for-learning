// JMenuBar
// public class JMenuBar extends JComponent implements 
//MenuElement, Accessible JMenu
// public class JMenu extends JMenuItem implements
//MenuElement, Accessible JMenuItem
// public class JMenuItem extends AbstractButton implements 
//Accessible,  MenuElement
import javax.swing.*;
import java.awt.event.*;
public class swingMenu implements ActionListener
{
	JFrame F;
	JMenuBar mb;
	JMenu File,Edit,Help;
	JMenuItem New,Open,Save,Cut,Copy,Paste,SelectAll;
	JTextArea T;
	swingMenu()
	{
		F=new JFrame();
		Cut=new JMenuItem("Cut");
		Copy=new JMenuItem("Copy");
		Paste=new JMenuItem("Paste");
		SelectAll=new JMenuItem("Select All");

		Cut.addActionListener(this);
		Paste.addActionListener(this);
		Copy.addActionListener(this);
		SelectAll.addActionListener(this);

		mb=new JMenuBar();
		File=new JMenu("File");
		Edit=new JMenu("Edit");
		Help=new JMenu("Help");
		Edit.add(Cut);Edit.add(Copy);
		Edit.add(Paste);Edit.add(SelectAll);

		mb.add(File);mb.add(Edit);mb.add(Help);

		T=new JTextArea();
		T.setBounds(15,15,300,300);
		F.add(mb);F.add(T);
		F.setJMenuBar(mb);F.setLayout(null);
		F.setSize(500,500);F.setVisible(true);
	}
	public void actionPerformed(ActionEvent E)
	{
		if(E.getSource()==Cut)
			T.cut();
		if(E.getSource()==Copy)
			T.copy();
		if(E.getSource()==Paste)
			T.paste();
		if(E.getSource()==SelectAll)
			T.selectAll();
	}
	public static void main(String[] args) {
		new swingMenu(); 
	}
}