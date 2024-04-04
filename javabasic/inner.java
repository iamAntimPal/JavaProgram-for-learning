class data{
	private int d;
	inside i =new inside();
	public void input(int d)
	{
		
		i.get(100);
		this.d=d;
	}
	public void show()
	{
		System.out.println(d);
		i.show2();
	}	
	
	class inside{
		int value;
		public void get(int value)
		{
			this.value=value;
		}
		public void show2()
		{
			System.out.println(value);
		}
		
	}
	
}
class Main{
	public static void main(String ar[])
	{
		data d= new data();
		d.input(200);
		d.show();
	}
}