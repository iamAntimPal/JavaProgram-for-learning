// Accessing the single class when package have multiple classes
import MyPackage.testPack;
import MyPackage.testpack1;


public class testmain2 {
     public static void main(String[] args) {
          testPack t=new testPack();
          t.show();
          testpack1 t1=new testpack1();
          t1.show();
     }     
}
