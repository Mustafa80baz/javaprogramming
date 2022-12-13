package day17While_DoWhileLoop;

import java.util.Scanner;

public class WillYouMarryMe {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Willyou mary me Yes/ No");
    String a= scan.next().toLowerCase();
        while (!(a.equals("yes") || a.equals("no"))){
            System.out.println("Invalid answer plsea re enter Yes/No");
            a= scan.next().toLowerCase();
        }
        if (a.equalsIgnoreCase("yEs")){
            System.out.println("tebrikler");

        }else {
            System.out.println("Goodbye");

        }


    }
}
