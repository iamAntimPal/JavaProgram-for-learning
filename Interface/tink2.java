import antim.name;
import java.util.*;
import antim.id;
class Myclass implements name,id{
	public void show2(){
		int b;
		Scanner s = new Scanner();
		b = s.nextInt();
		System.out.println("Name is :-"+b);
		
	}
	public void show1(){
		int a;
		Scanner s = new Scanner();
		a=s.nextInt();
		System.out.println("id is :-"+a);
		
	}
}
class Main{
	public static void main(String ar[])
	{
			Myclass m=new Myclass();
			m.show2();
			m.show1();
	}
}