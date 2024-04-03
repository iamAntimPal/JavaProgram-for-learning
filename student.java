import java.util.Scanner;
import java.util.jar.Attributes.Name;

class Stud {
     protected String name;
     protected int id;

     protected void get() {
          Scanner s = new Scanner(System.in);
          System.out.println("Enter the name");
          name = s.nextLine();
          System.out.println("Enter the Id");
          id = Integer.parseInt(s.nextLine());
     }

     protected void show() {
          System.out.println("Name is : " + name);
          System.out.println("Id is : " + id);
     }
}

class Teacher extends Stud {
     
}

class Studinfo extends Stud {
}

class Student {
     public static void main(String[] args) {
          char i;
          int ch;
          Scanner c = new Scanner(System.in);
          do {
               System.out.println("1 for student information");
               System.out.println("2 for Teacher information");
               System.out.println("Enter your choice");

               ch = Integer.parseInt(c.nextLine());

               switch (ch) {
                    case 1: {
                         Studinfo s = new Studinfo();
                         s.get();
                         s.show();
                         break;
                    }
                    case 2: {
                         Teacher t = new Teacher();
                         t.get();
                         t.show();
                         break;
                    }
                    default: {
                         System.out.println("You entered the wrong choice");
                         break;
                    }
               }
               System.out.println("Enter the choice (y/n)");
               i = c.nextLine().charAt(0);
          } while (i == 'y');

     }
}