package antim;
public class even extends Thread {

     public void run() {
          for (int i = 1; i <= 20; i++) {
               if (i % 2 == 0) {
                    System.out.println("even " + i);
                    try {
                         Thread.sleep(2000);
                    } catch (Exception e) {
                    }
               }
          }
     }

}