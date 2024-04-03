import java.util.*;

class books {
     protected String name;
     protected String title;
     protected String Arthour;

     protected void get(){
          Scanner s=new Scanner(System.in);
          System.out.println("inter the name of book");
          name=s.next();
          System.out.println("inter the title of boook");
          s.nextLine();
             title=s.nextLine();
          System.out.println("inter the Arthour nameof book");
          Arthour=s.nextLine();
     }
     protected void show() {
          System.out.println("name is : -"+name);
          System.out.println("Title is : -"+title);
          System.out.println("Arthor name is : - "+Arthour);
     }
}

     class javaB extends books {

     }

     class python extends javaB{

     }

     class dbms extends python {

     }

public class book {
     public static void main(String[] args) {
          dbms db=new dbms();
          db.get();
          db.show();
     }
     
}
