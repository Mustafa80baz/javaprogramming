package ReplitCözumleriEnBastan;

import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int number = scan.nextInt();
        if (number>0){
            System.out.println("positive");
        } else if (number<0) {
            System.out.println("negative");

        }else {
            System.out.println("zero");
        }

    }
}
