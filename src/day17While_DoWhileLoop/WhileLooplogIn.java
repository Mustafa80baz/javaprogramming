package day17While_DoWhileLoop;

import java.util.Scanner;

public class WhileLooplogIn{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // user name :Cydeo   password:Cydeo123    şifreyi 3 kere girme hakkı ver 3 de yanlış plursa blok oldu de
/*

        System.out.println("enter your user name");
        String u= scan.next();
        System.out.println("enter your password");
        String pas=scan.next();
        if (u.equals("Cydeo") && pas.equals("Cydeo123")){// bigiler doğru ise login olur
            System.out.println("Logged in");
        }else {// şifre doğru değilse  3 kere girme hakkı veriri
            int attemp=3;
            while (!(u.equals("Cydeo") && pas.equals("Cydeo123")) && attemp >0){// 3 kere girme hakkı
                System.out.println( "Incorrect user or password,plsreenter");
                System.out.println("enter your user Name");
                u= scan.next();
                System.out.println("Enter your password");
                pas =scan.next();
                attemp--;
            }
            if (u.equals("Cydeo") && u.equals("Cydeo123")){
                System.out.println("Logged in");
            }else {
                System.out.println("your account is locked");
            }
        }
scan.close();
     /*
       System.out.println("---------------");
 */


        System.out.println("enter a user name");
        String user=scan.next();
        System.out.println("enter pass");
        String pas =scan.next();
        if ((user.equals("mustafa") || pas.equals("baz"))){
            System.out.println("logged in");
        }else {
            System.out.println("olamadı bidaha ");
            int attaemp=3;
            while (!(user.equals("mustafa")  || pas.equals("baz") && attaemp>0)){
                System.out.println("lütfen tekrar deneyiniz");
                System.out.println("user again");
              user=scan.next();
                System.out.println("tşifre again");
                pas=scan.next();
                attaemp --;
            }
            if (user.equals("Mustafa")  || pas.equals("baz")){
                System.out.println("logged in");
            }else {
                System.out.println("your accunt gitti");
            }
          scan.close();
        }


    }
}
