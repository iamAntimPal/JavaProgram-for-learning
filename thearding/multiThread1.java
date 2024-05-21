public class multiThread1 extends Thread {
     public void run() 
     {
          System.out.println("Thread is accessible ");
          for (int i = 0; i <10; i++)
          {
               System.out.println(i);
          }
     }
     public static void main(String[] args) {
          multiThread1 M1=new multiThread1();
          //M1.start();
          M1.run();
          
     }
}
