public class student_total {
     public static void main(String[] args) {
          double T,A;
          T=Double.parseDouble(args[0])+Double.parseDouble(args[1])+Double.parseDouble(args[2])+Double.parseDouble(args[3])+Double.parseDouble(args[4]);
          A=Double.parseDouble(args[0])+Double.parseDouble(args[1])+Double.parseDouble(args[2])+Double.parseDouble(args[3])+Double.parseDouble(args[4])/2;
          System.out.println("Total is "+T);
          System.out.println("Average is"+A);
     }
}
