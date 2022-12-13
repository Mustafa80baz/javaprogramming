package ReplitCozumleri;

import java.util.Scanner;

public class convertSecondToHourAndMinutes {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter the total second");
        int inputSecond= scan.nextInt();
        int hours =inputSecond/3600;
        int minutes=(inputSecond%3600)/60;
        int seconds =inputSecond%60;


        System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");

        }









    }

