import java.util.Scanner;

interface Shape {
     void calculateArea();

     void calculatePerimeter();
}

class Rectangle implements Shape {
     private int length;
     private int width;

     public Rectangle(int length, int width) {
          this.length = length;
          this.width = width;
     }

     public void calculateArea() {
          int area = length * width;
          System.out.println("Rectangle Area: " + area);
     }

     public void calculatePerimeter() {
          int perimeter = 2 * (length + width);
          System.out.println("Rectangle Perimeter: " + perimeter);
     }
}

class Circle implements Shape {
     private double radius;

     public Circle(double radius) {
          this.radius = radius;
     }

     public void calculateArea() {
          double area = Math.PI * radius * radius;
          System.out.println("Circle Area: " + area);
     }

     public void calculatePerimeter() {
          double perimeter = 2 * Math.PI * radius;
          System.out.println("Circle Perimeter: " + perimeter);
     }
}

public class ShapeExample {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Enter length and width for rectangle:");
          int length = scanner.nextInt();
          int width = scanner.nextInt();
          Rectangle rectangle = new Rectangle(length, width);

          System.out.println("Enter radius for circle:");
          double radius = scanner.nextDouble();
          Circle circle = new Circle(radius);

          scanner.close();

          rectangle.calculateArea();
          rectangle.calculatePerimeter();
          circle.calculateArea();
          circle.calculatePerimeter();
     }
}
