class data{
	private int d;
	
	public data(int d)
	{
		this.d=d;
		
	}
	public void show()
	{
		System.out.println("outer "+d);
		
	}	
	
	class inside{
		private int value;
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
class Main3{
	public static void main(String ar[])
	{
		data d= new data(200);
		d.show();
		
		data.inside i = d.new inside(100);
		i.show2();
		
	}
}

// outer.inner_name i = outer_object.new inner();

