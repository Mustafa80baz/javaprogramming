package ReplitCözumleriEnBastan;

import java.util.Scanner;

public class WriteTheTime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write the hour");
        int hour= scan.nextInt();
        System.out.println("enter minute");
        int mınute= scan.nextInt();
        System.out.println("enter second ");
        int second= scan.nextInt();
        System.out.println("enter AmOrPm");
        String AMOrPm= scan.next();
        System.out.println(hour+":"+mınute+":"+second+" "+AMOrPm);




    }
}
