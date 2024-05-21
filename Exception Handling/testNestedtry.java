
public class testNestedtry {
     public static void main(String[] args) {
          int a [] = {1,2,3,4,5};
               try 
               {
                    System.out.println("vlue of elements "+a[3]);
                    try
                    {
                         int c=a[4]/(a[3]-4);
                         System.out.println(c);
                    }
                    catch (ArithmeticException e)
                    {
                         System.out.println("value of c"+e);
                    }
               }
               catch (IndexOutOfBoundsException e)
               {
                    System.out.println(" :-"+ e);
               }  
     }   
}
