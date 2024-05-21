import java.util.*;
public class power_num {
     public static void main(String arg []){
          int num, c;
          Scanner s = new Scanner(System.in);
          System.out.println("Enter Number");
          num = s.nextInt();
          if (num % 2 == 0) {
               c = num * num;
          } else {
               c = num * num * num;
          }
          System.out.println("output is " + c);

     }
}
