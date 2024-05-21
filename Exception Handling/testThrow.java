import java.util.*;

public class testThrow {
     static void show(int a[])
     {
               Scanner scanner = new Scanner(System.in);
               System.out.println("enter index for data");
               int n=scanner.nextInt();
               int i;
               try {
                    i=a[n]/a[4]-(a[2]+a[0]);
                    System.out.println("Result: " + i);
          }
          catch (Exception e) {
               throw e;
          }
     }
     public static void main(String[] args) {
          int a[]={1,2,3,4,5};
          try
          {
               show(a);

          }
          catch (Exception e)
          {
               System.out.println(e);
          }
     }
}
