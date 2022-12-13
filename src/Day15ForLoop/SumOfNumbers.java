package Day15ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
//sayıları 1 den yuz e toplayarak  yazdır dersem nasıl olur
//1+2=3+3=6+4=10+5=15..... gibi
   int sum=0;  // 1 den başlaması için  sum =0 ,1+2+3+4...
        for (int i = 1; i < 101; i++) {// 100 de dahil oması için 101 diyebilirz
            sum +=i;//

        }
        System.out.println(sum);
        System.out.println("--------------------------------");
// write a program ask user enter 5 times number
        int total=0;
        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number");
            total+= scan.nextInt();
            System.out.println("total = " + total);
            scan.close();
        }
        }



    }
