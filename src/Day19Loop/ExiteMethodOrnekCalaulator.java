package Day19Loop;

import java.util.Scanner;

public class ExiteMethodOrnekCalaulator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int num1= scan.nextInt();
        System.out.println("enter a char operator");
        char operator=scan.next().charAt(0);
        if (!(operator=='+') || operator=='-' ){
            System.err.println("invalid operator");
            System.exit(0);
        }
        System.out.println( "enter scond number");
        int num2=scan.nextInt();
        if (operator=='-'){
            System.out.println(num1-num2);
        }else {
            System.out.println(num1+num2);
        }
    }
}
