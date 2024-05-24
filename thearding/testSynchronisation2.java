
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

class myThread1 extends Thread {
     table T;

     myThread1(table T) {
          this.T = T;
     }

     public void run() {
          T.showTable(5);
     }
}

class myThread3 extends Thread {
     table T;

     myThread3(table T) {
          this.T = T;
     }

     public void run() {
          T.showTable(7);
     }
}

class myThread2 extends Thread {
     table T;

     myThread2(table T) {
          this.T = T;
     }

     public void run() {
          T.showTable(25);
     }
}

public class testSynchronisation2 {
     public static void main(String[] args) {
          table obj = new table();
          myThread1 T1 = new myThread1(obj);
          myThread2 T2 = new myThread2(obj);
          myThread3 T3 = new myThread3(obj);
          T1.start();
          T2.start();
          T3.start();
     }
}
