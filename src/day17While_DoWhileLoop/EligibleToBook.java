package day17While_DoWhileLoop;

import java.util.Scanner;

public class EligibleToBook {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scan.nextInt();// -20 veta 150  girerse tekrar girmesi için 0 la 120 arasını kabul edecez mesela
        while (!(age>=1 && age<=120)){// girilen yas 0 la 120 arası olamzase tekrar gir der
            // 0 la 120 aarsında bir numara girene kadar
            System.err.println("invalid age reenter your age");
            age= scan.nextInt();
            //while () repeat statements unknown time
        }
        System.out.println("Are you a US citizen? Yes/no");
       String answer=scan.next().toLowerCase();
        while(!(answer.equals("yes") || answer.equals("no"))){
           System.err.println("invalidentry pls reenter");
             answer=scan.next().toLowerCase();
        }
           if (age >=18 && answer.equals("yes")){
               System.out.println("you are eligible ");
           }else {
           System.out.println("you are not eligilbe");

        }

        System.out.println("enter your age");
           int age1= scan.nextInt();
        while (!(age1>=18) || age<=100){
            System.out.println("geçersiz yaş");
            System.out.println("tekrar yasını gir");
            scan.nextInt();
        }
        System.out.println("uyrugunu gir");

    }
}


