import java.awt.*;
class Registration{
	Registration()
	{
		Frame f=new Frame();
		f.setTitle("Registration From");
		f.setSize(1100,800);
		f.setVisible(true);
		f.setLayout(null);

		Font f1=new Font("elephant",Font.BOLD,45);
		Font f2=new Font("elephant",Font.BOLD,20);
		Font f3=new Font("elephant",Font.BOLD,16);

		Label L1=new Label("Registration From");
		L1.setBounds(300,70,400,50);
		L1.setFont(f1);
		// L1.setBackgraoud(Color.BLUE);
		f.add(L1);


		Label L2=new Label("Name");
		L2.setBounds(100,140,70,30);
		L2.setFont(f2);
		f.add(L2);

		Label L3=new Label("Mobile");
		L3.setBounds(100,200,70,30);
		L3.setFont(f2);
		f.add(L3);

		TextField t1=new TextField();
		t1.setBounds(180,140,300,30);
		// t1.setHorizontalAlignment(TextField.CENTER);
		t1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		f.add(t1);

		TextField t2=new TextField();
		t2.setBounds(180,200,250,30);
		t2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		f.add(t2);

		Label L4=new Label("Gender");
      	L4.setBounds(100,250,80,20);
		L4.setFont(f2);
		f.add(L4);

		CheckboxGroup ch1=new CheckboxGroup();

		Checkbox c1=new Checkbox("male",false,ch1);
		c1.setBounds(190,250,50,20);
		c1.setFont(f3);
		f.add(c1);

		Checkbox c2=new Checkbox("Female",false,ch1);
		c2.setBounds(320,250,80,20);
		c2.setFont(f3);
		f.add(c2);

		Label L5=new Label("DOB");
		L5.setBounds(100,300,50,20);
		L5.setFont(f2);
		f.add(L5);

		Choice cb1=new Choice();
		cb1.setBounds(200,300,50,20);
		cb1.setFont(f3);
		f.add(cb1);
		// cb1.add("1");cb1.add("2");cb1.add("3");cb1.add("4");cb1.add("5");cb1.add("6");
		// cb1.add("7");cb1.add("8");cb1.add("9");cb1.add("10");cb1.add("11");cb1.add("12");
		// cb1.add("13");cb1.add("14");cb1.add("15");cb1.add("16");cb1.add("17");cb1.add("18");
		// cb1.add("19");cb1.add("20");cb1.add("21");cb1.add("22");cb1.add("23");cb1.add("24");
		// cb1.add("25");cb1.add("26");cb1.add("27");cb1.add("28");cb1.add("29");cb1.add("30");
		// cb1.add("31");

		for(int i=1;i<=31;i++)
		{
			cb1.add(Integer.toString(i));
		}



		Choice cb2=new Choice();
		cb2.setBounds(280,300,50,20);
		cb2.setFont(f3);
		f.add(cb2);
		String arr[]={"jan","feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		
		for(String i:arr)
				{
					cb2.add(i);
					
				}


		Choice cb3=new Choice();
		cb3.setBounds(360,300,70,20);
		cb3.setFont(f3);
		f.add(cb3);

		for(int i=1990;i<=2024;i++)
		{
			cb3.add(Integer.toString(i));
		}
		


		Label L6=new Label("Address");
		L6.setBounds(100,350,100,20);
		L6.setFont(f2);
		f.add(L6);

		TextArea T1=new TextArea();
		T1.setBounds(230,350,300,180);
		T1.setFont(f3);
		f.add(T1);


		Checkbox c3=new Checkbox("Accept Terms and Condition",false);
		c3.setBounds(180,580,300,30);
		c3.setFont(f3);
		f.add(c3);

		Button B1=new Button("Submit");
		B1.setBounds(180,620,100,30);
		B1.setFont(f2);
		B1.setForeground(Color.WHITE);
		B1.setBackground(Color.BLUE);
		f.add(B1);

		Button B2=new Button("Reset");
		B2.setBounds(320,620,100,30);
		B2.setFont(f2);

		B2.setBackground(Color.BLUE);
		B2.setForeground(Color.WHITE);
		f.add(B2);

		TextArea T2=new TextArea();
		T2.setBounds(550,140,500,550);
		f.add(T2);

	}
	public static void main(String[] args) {
		Registration r=new Registration();
	}
}