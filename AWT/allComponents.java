import java.awt.*;
class allcomponents
{
	private Frame f;
	private Label L1;
	private Button B1;
	private TextField T1;
	private Checkbox C1;
	private Checkbox radio;
	
	allcomponents(){
		// For Frame/ Main Frame 
		f=new Frame();
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(null);
		f.setTitle("All Java AWT Components");

		//For Label
		L1=new Label("This is My Label");
		L1.setBounds(100,100,150,30);
		f.add(L1);

		// for Button
		Button B1=new Button("Submit");
		B1.setBounds(200,300,100,40);
		f.add(B1);

		//for textfield
		TextField T1=new TextField();
		T1.setBounds(100,150,100,20);
		f.add(T1);

		//for checkbox
		Checkbox C1=new Checkbox("yes",true);
		C1.setBounds(100,170,50,20);
		f.add(C1);

		//for Checkbox 
		Checkbox C2=new Checkbox("No",false);
		C2.setBounds(160,170,50,20);
		f.add(C2);

		CheckboxGroup Rb1=new CheckboxGroup();
		//for checkboxGroup And Radio button
		Checkbox C3=new Checkbox("Radiobutton",true,Rb1);
		C3.setBounds(100,200,100,20);
		f.add(C3);

		//for CheckboxGroup and RadioiButton 
		Checkbox C4=new Checkbox("Radio",false,Rb1);
		C4.setBounds(220,200,100,20);
		f.add(C4);
		// for Textarea
		TextArea Ta1=new TextArea();
		Ta1.setBounds(200,320,100,50);
		f.add(Ta1);

		//Choice box 
		Choice Ch1=new Choice();
		Ch1.setBounds(200,380,100,30);
		f.add(Ch1);

		//Panel
		Panel P=new Panel();
		P.setBounds(100,400,200,100);
		P.setBackground(new Color(255,0,0));
		P.setLayout(null);
		f.add(P);

		//For Label in panel
		Label L2=new Label("This is My Label");
		L2.setBounds(0,0,150,30);
		P.add(L2);
		L2.setBackground(new Color(255,0,0));
		L2.setForeground(Color.BLACK);



	}
	public static void main(String[] args) {
		allcomponents a=new allcomponents();
	}
}