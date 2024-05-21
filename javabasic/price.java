import java.util.*;
class price{
     public static void main(String[] args) {
          int cost_price,sell_price,price;
          Scanner s = new Scanner(System.in);
          System.out.println("enter the cost price");
          cost_price = s.nextInt();
          System.out.println("enter sell price");
          sell_price = s.nextInt();
          price = sell_price - cost_price;
          if(cost_price>sell_price)
          {
               
               System.out.println("Your lose price  is "+"  "+price);
          }
          else{
               System.out.println("your profit price is " + "  "+price);
          }
     }
}