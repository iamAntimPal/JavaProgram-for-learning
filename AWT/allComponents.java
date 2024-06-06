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
		L1.setbounds(100,100,80,30);
		f.add(L1);
	}
}