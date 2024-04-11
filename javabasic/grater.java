/* WAP TO which number dis grater in input */
import java.util.Scanner;
public class grater {
     public static void main(String[] args) {
          int a, b, c,d;
          Scanner scanner = new Scanner(System.in);
          System.out.println("enter 2 numbers");
          a = scanner.nextInt();
          b = scanner.nextInt();
          c=scanner.nextInt();
          /*
           * a>b a>c a
           * c>b c>b c
           * b>c b>c b
           */
          d= (a > b && a>c) ? a :(c>b && c>a)?c:b;
          System.out.println("Grater is :-"+d);
     }
     
}
