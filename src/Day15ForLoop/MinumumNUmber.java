package Day15ForLoop;

import java.util.Scanner;

public class MinumumNUmber {
    public static void main(String[] args) {
        //Write a program that asks the user a number for 5 times returns the minumum number

        Scanner scan=new Scanner(System.in);

        System.out.println("--------------------");

        int min1=4563216;
        for (int i = 0; i < 3; i++) {
            System.out.println("enter number");
          int  max=scan.nextInt();
          if (max<min1){
              min1=max;
              System.out.println("min =" +max);
          }

        }



    }

    }


