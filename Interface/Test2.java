import java.util.Scanner;

interface shape {
     void calculatePerimeter();
     void calculateArea();
}

class rectangle implements shape {
     public void calculateArea() {
          int c, x, y;
          Scanner s = new Scanner(System.in);
          x = s.nextInt();
          y = s.nextInt();
          c = x * y;
          System.out.println("Rectangle Area: " + c);
     }

     public void calculatePerimeter() {
          int c,x,y;
          Scanner s=new Scanner(System.in);
          x=s.nextInt();
          y=s.nextInt();
          c = 2 *(x+y); // Updated formula for rectangle perimeter
          System.out.println("Rectangle Perimeter: " + c);
     }
}

class circle implements shape {
     public void calculateArea() {
          double c;
          int  x, y;
          Scanner s = new Scanner(System.in);
          x = s.nextInt();
          c = 3.14* x * x; // Updated formula for circle area
          System.out.println("Circle Area: " + c);
     }

     public void calculatePerimeter() {
          double c;
          int  x, y;
          Scanner s = new Scanner(System.in);
          System.out.println(" enter the number")
          x = s.nextInt();
          c = 2 *3.14 * x; 
          System.out.println("Circle Perimeter: " + c);
     }
}

public class Test2 {
     public static void main(String ar[]) {
          rectangle r = new rectangle();
          circle c = new circle();
          c.calculateArea();
          c.calculatePerimeter();
          r.calculateArea();
          r.calculatePerimeter();
     }
}
