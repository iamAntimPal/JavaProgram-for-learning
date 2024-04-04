class data{
	private int d;
		
	static class inside{
		private int value;
		public inside(int value,int da)
		{
			this.value=value;
			// d=da;
		}
		public void show2()
		{
			System.out.println("inner "+value);
			// System.out.println("outer "+d);
		}
		
	}
	
}
class Main3{
	public static void main(String ar[])
	{
		data.inside i =new data.inside(100,200);
		i.show2();
		
	}
}

// outer.inner_name i = outer_object.new inner();

