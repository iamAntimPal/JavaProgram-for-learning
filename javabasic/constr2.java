class student{
	private int id;
	private String name;
	
	student(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	public void show()
	{
		System.out.println("id is "+id);
		System.out.println("name is "+name);
	}
	
	
	
	
}

class Myclass{
	public static void main(String ar[])
	{
		student s=new student(101,"naman");
		s.show();		
	}
	
}