abstract class shape{
	abstract public void show();
}
class circle extends shape{
	public void show(){
		System.out.println("im circle");
		
	}
}
class rectangle extends shape{
	public void show(){
		System.out.println("im rectangle");
	
	}
}
class Test2{
	public static void main(String ar[])
	{
		// shape b =new shape(); // error  shape is abstract; cannot be instantiated
		
		rectangle r= new rectangle();
		r.show();
		
	}
	
}