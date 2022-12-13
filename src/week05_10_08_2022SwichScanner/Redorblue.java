package week05_10_08_2022SwichScanner;

import java.util.Scanner;

public class Redorblue {
    public static void main(String[] args) {
        /*
         Task 4: Given a string, if the string begins with "red" or "blue" print
          that color string, otherwise print the empty string.

     *                 input :"redxx" → "red"
     *                 input :"xxred" → ""
     *                 input :"blueTimes" → "blue"
         */

        Scanner scan=new Scanner(System.in);
        String as="redxx";
        if (as=="redxx"){
            System.out.println("red");
        } else if (as=="blue") {
            System.out.println("blue");

        }else {
            System.out.println(" ");


    }
    }
}
