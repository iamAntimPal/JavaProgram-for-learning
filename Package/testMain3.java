// inheriting from package 
import MyPackage.testPack;
import MyPackage.testpack1;

class test extends testPack
{
     void display()
     {
          System.out.println("I am diplay from test class");
     }
}
public class testMain3 {
     public static void main(String[] args) {
          test t=new test();
          t.display();
          t.show();
     }
}
