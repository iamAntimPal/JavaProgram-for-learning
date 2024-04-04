class box{
	static int c=0;
	public void show()
	{
		System.out.println("hello");
		c++;
	}
	
}

class Myclass{
	public static void main(String ar[])
	{
		box b,b2,b3;
		b=new box();
		b2=new box();
		b3=new box();
		
		b.show();
		b2.show();
		System.out.println(box.c);
		b2.show();
		b2.show();
		System.out.println(box.c);
		
	}
	
}