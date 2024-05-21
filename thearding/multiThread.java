
public class multiThread implements Runnable{
     public void run() {
          System.out.println("Thread is accessible ");
         
     }

     public static void main(String[] args) {
          multiThread M1 = new multiThread();
          Thread t = new Thread(M1);
          t.start();
          System.out.println(t.getName()); //get name of thread
          // M1.start();
          //M1.run();

     }
}
