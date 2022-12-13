package Day18NestedLoop;

import java.util.Scanner;

public class EvenAndoddNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true){
       System.out.println("Pleas enter a number");
        int num= scan.nextInt();
        if (num%2==0){
            System.out.println(num+" is Even Number");

            }else {
            System.out.println(num+" is odd number");
            }
        System.out.println("Would you like to enter another number");
       String a= scan.next().toLowerCase();
       while (!(a.equals("yes")  ||  a.equals("no"))){//cevap yes veay no deilse burası calısır
           System.out.println("please re enter, would you like to enter another number");
           a= scan.next().toLowerCase();
       }
       if (a.equals("no")){
           break;
       }

       scan.close();
        }



        /*
        Write a program that ask user to enter a number, and check if the number is odd or even number
        if it is odd print "Odd Nmber"
        if it is even prin "Even Number"
        Ask teh user "Would you like to  enter another number"
        if user enters yes, repeat the previous steps
        if you user enters no,prints nothing
        if user entersinvalid answer, repeat the previous steps
         */

    }
}
