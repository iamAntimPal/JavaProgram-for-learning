import java.util.*;
class Main5{
	public static void main(String ar[])
	{
	System.out.println("Start.....");
		
		int a,b;
		Scanner S=new Scanner (System.in);
		try{
			a=S.nextInt();
			b=S.nextInt();
			System.out.println(a/b);
		}
		catch(ArithmeticException obj)
		{
			System.out.println("sorry");
		}
		catch(InputMismatchException e)
		{
			System.out.println("sorry2");
		}
		
		
		System.out.println("End.....");
	}
}