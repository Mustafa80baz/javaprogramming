package day15ForAndLoopTaskcozum;

import java.util.Scanner;

public class SpecialCharacter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word= scan.next();
       char firstchar=word.charAt(0);
        String result="";
        if (firstchar>='0' && firstchar<='9'){

            System.out.println("it is a digit number");

        } else if (firstchar>='A' &&firstchar<='Z') {
            System.out.println("it is alphabet");
        } else if (firstchar>='a'  && firstchar<='z') {
            System.out.println("it is again alphabet");


        }else {
            System.out.println("özel karakterdir");


    }
    }
}
