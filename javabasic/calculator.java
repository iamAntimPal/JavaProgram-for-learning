import java.util.*;
public class calculator {
     public static void main(String[] args) {
          int a,b;
          char ch='y';
          
          while(ch =='y' || ch =='Y')
          {
               Scanner S = new Scanner(System.in);
               System.out.println("enter two number ");
               a = S.nextInt();
               b = S.nextInt();
               System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.exit");
               int choice=S.nextInt();
               switch(choice)
               {
                    case 1:System.out.println("Result :-"+(a+b));
                    break;
                    case 2:System.out.println("Result :-"+(a-b));
                    break;
                    case 3:System.out.println("Result :-"+(a*b));
                    break;
                    case 4:System.out.println("Result :-"+(a/b));
                    break;
                    case 5:System.exit(0);
                    break;
                    default:System.out.println("invalid choice");
                    break;
               }
               System.out.println("do you want to continue(y/n)");
               ch=S.next().charAt(0);
          }

     }
}
