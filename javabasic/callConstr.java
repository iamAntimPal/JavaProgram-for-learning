class data{
	private int d;
	
	public data(int d,int v)
	{
		inside i =new inside(v);
		this.d=d;
		i.show2();
	}
	public void show()
	{
		System.out.println("outer "+d);
		
	}	
	
	class inside{
		int value;
		public inside(int value)
		{
			this.value=value;
		}
		public void show2()
		{
			System.out.println("inner "+value);
		}
		
	}
	
}
class Main2{
	public static void main(String ar[])
	{
		data d= new data(200,100);
		d.show();
	}
}