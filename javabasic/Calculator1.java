
// WAP to Calculator

import java.util.*;

public class Calculator1 {
class calculator
{
	public static void main(String[] args) 
	{
		int a,b,c=0;
		char ch;
		Scanner S=new Scanner(System.in);
		System.out.println("enter te oprator");
		ch=S.next().charAt(0);
		switch(ch)
		{
			case '+':{
				System.out.println("enter the first number");
				a=S.nextInt();
				System.out.println("enter second");
				b=S.nextInt();
				c=a+b;
				System.out.println("Result :-"+c);
			}
			case '-':{
				System.out.println("enter the first number");
				a=S.nextInt();
				System.out.println("enter second");
				b=S.nextInt();
				c=a-b;
				System.out.println("Result :-"+c);
			}
			case '*':{
				System.out.println("enter the first number");
				a=S.nextInt();
				System.out.println("enter second");
				b=S.nextInt();
				c=a*b;
				System.out.println("Result :-"+c);
			}
			case '/':{
				System.out.println("enter the first number");
				a=S.nextInt();
				System.out.println("enter second");
				b=S.nextInt();
				c=a/b;
				System.out.println("Result :-"+c);
			}
			default:{
				System.out.println("Invalid input");	
			}
		}
	}
}
}
