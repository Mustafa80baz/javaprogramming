package week05_10_08_2022SwichScanner;

import java.util.Scanner;

public class CalculatorKendimDeneme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        double number1= scan.nextDouble();
        System.out.println("enter a number again");
        double number2= scan.nextDouble();
        System.out.println("Please enter your operator");
       char operator= scan.next().charAt(0);
       switch (operator){
           case '+':
               System.out.println(number1+number2);
               break;
           case '-':
               System.out.println(number1-number2);
               break;
           case '*':
               System.out.println(number1*number2);
       }

    }
}
