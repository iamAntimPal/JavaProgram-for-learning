
class Mythread implements Runnable{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}

class Main{
		public static void main(String ar[])
		{
			Mythread m= new Mythread();
			Thread t = new Thread(m);
			t.start();
		}
}