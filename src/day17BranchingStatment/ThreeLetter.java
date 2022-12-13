package day17BranchingStatment;

import java.util.Scanner;

public class ThreeLetter {
    public static void main(String[] args) {
        /*
        soru:6. write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:if the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
         */
        Scanner scan=new Scanner(System.in);
        char ch='a';
        System.out.println("enter three letters word");
        String word= scan.next();
        if (word.length()>3){
            System.out.println("Word is too long");
        } else if (word.length()<3) {
            System.out.println("Word is too short");

        }else {
        if (word.charAt(word.length()-2)=='a'){
            System.out.println("Cool word");
        }else {
            System.out.println("okay word");

        }
        scan.close();
    }

}

}

