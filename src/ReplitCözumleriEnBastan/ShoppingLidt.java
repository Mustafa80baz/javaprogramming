package ReplitCözumleriEnBastan;

import java.util.Scanner;

public class ShoppingLidt {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter item1 and its price");
       String item1=scan.next();
       double price1= scan.nextDouble();

        System.out.println("enter item2 and its price");
        String item2=scan.next();
        double price2= scan.nextDouble();
        System.out.println("enter item3 and its price");
        String item3=scan.next();
        double price3= scan.nextDouble();
        double totalPrice=price1+price2+price3;
        System.out.println(totalPrice);
    }
}
