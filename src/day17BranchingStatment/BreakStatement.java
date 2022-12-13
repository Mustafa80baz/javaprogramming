package day17BranchingStatment;

import java.util.Scanner;

public class BreakStatement {

    public static void main(String[] args) {
        // causes the termination of loop
        for (char i = 'A'; i < 'Z'; i++) {
            System.out.print(i+" ");
            if (i=='F'){//loop u F de keser
                break;//for dongüsünü burada keser
            }


        }

        System.out.println();
        System.out.println("----------------------");


        //kulllnıcıya sayı girmesini söyleyecez... eksi sayı girdiklerinde durur
        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("enter a number: ");
            int num=scan.nextInt();
            if (num<0){
                break;
            }


        }
    }
}
