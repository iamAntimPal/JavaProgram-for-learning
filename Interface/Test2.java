import java.util.Scanner;

interface shape {
     void calculatePerimeter();
     void calculateArea();
}

class rectangle implements shape {
     public void calculateArea(int x, int y) {
          int c;
          c=x*y;
          System.out.println(c);
     }
     public void calculatePerimeter(int x,int y) {
          int c;
          c=2*x+y;
          System.out.println(c);
     }
}

class circle implements shape {
     public void calculatePerimeter(int x, int y) {
          int c;
          c=2*x+y;
          System.out.println(c);
     }

     public void calculateArea(int x, int y) {
          int c;
          c=x*y;
          System.out.println(c);
     }
}

public class Test2 {
     public static void main(String ar[]) {
          rectangle r = new rectangle();
          circle c = new circle();
          Scanner S = new Scanner(System.in);
          int a = S.nextInt();
          int b = S.nextInt();
          r.calculatePerimeter(a, b);
          r.calculateArea(a, b);
          c.calculateArea( a,b);
          c.calculatePerimeter(a, b);
     }
}
