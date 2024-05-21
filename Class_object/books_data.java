package Class_object;
import java.util.*;
class Book_detail{
     private String book_name;
     private int book_id;
     private String book_arthour;
     void Readinput(String book_name,int book_id,String book_arthour)
     {
          this.book_name =book_name;
          this.book_id =book_id;
          this.book_arthour =book_arthour;
     }
     void Showoutput()
     {
          System.out.println("name: " + book_name);
          System.out.println("id is: " + book_id);
          System.out.println("arthour: " + book_arthour);
     }
}
public class books_data {
     public static void main(String[] args) {
          int book_id,size = 0,i;
          String a,c;
          Scanner s=new Scanner(System.in);
          System.out.println("enter to How many books to read");
          size = s.nextInt();
          Book_detail b[] = new Book_detail[size];
          System.out.println("inter the Name: " );
          a=s.next();
          System.out.println("enter the Book id: ");
          book_id=s.nextInt();
          System.out.println("enter the Book Arthour name: ");
          c=s.next();
          for(i=0;i<size;i++)
          {
               b[i].Readinput(a, book_id, c);
          }
               
     }
     
}
