class methodJoin extends Thread 
{
     public void run() 
     {
          for (int i = 0; i <=5; i++) 
          {
               System.out.println("i " + i);
               try
               {
                    System.out.println("Thread Name -" + Thread.currentThread().getName() );
                    Thread.sleep(1000);
               }
               catch (InterruptedException e) 
               {
                    System.out.println("Exeception -");
               }
               System.out.println("Exit Code -");
          }
     }
}

public class testThread1
{
        public static void main(String[] args) 
   {
     methodJoin th1=new methodJoin();
     methodJoin th2=new methodJoin();
     methodJoin th3=new methodJoin();

     th1.start();
     
     try
     {
          th1.join(1500);
     }
     catch (InterruptedException e)
     {

     }
     th2.start();
     th3.start();
     }  
}

