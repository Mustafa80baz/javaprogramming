package day17While_DoWhileLoop;

import java.util.Scanner;

public class CalculatorWithWhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first number");
       int num1= scan.nextInt();
        System.out.println("Enter your second number");
        int num=scan.nextInt();
        System.out.println("Enter your math operator");
        char ch=scan.next().charAt(0);
     while (!(ch=='+' || ch=='-')){//yanlış bir operator girerse tekrar tekrar sorar
         // toplama yada cıkarma işareti girince biter
            System.out.println("Invalid operator, Please reEnter");
            ch=scan.next().charAt(0);
        }
        System.out.println((ch =='+')? num1+num:num1-num);
        System.out.println("-----------------------------------");
        System.out.println("enhter a number");
      int numa = scan.nextInt();
        System.out.println(" enter second nmber");
        int numc=scan.nextInt();
        System.out.println("select operator");
        char op=scan.next().charAt(0);
        while (!(op=='+' || op=='*')){
            System.out.println("geçersiz işlem tekrar deneyin");
            scan.next().charAt(0);
        }
        System.out.println((op=='+')? numa +numc:numa*numc);
        scan.close();
    }
}
