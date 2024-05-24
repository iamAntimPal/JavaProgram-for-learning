
class table {
     synchronized void showTable(int n) {
          for (int i = 1; i <= 10; i++) {
               System.out.println(n * i);
               try {
                    Thread.sleep(600);
               } catch (Exception e) {
                    System.out.println(e);
               }
          }
     }
}



public class testSynchronisation3 {
     public static void main(String[] args) {
          table obj = new table();
          Thread T1 = new Thread(obj)
          {
                public void run() 
                {
                    T1.showTable(25);
               }
          }
          Thread T2 = new Thread(obj)
          {

          }
          Thread T3 = new Thread(obj)
          {
               
          }
          T1.start();
          T2.start();
          T3.start();
     }
}
