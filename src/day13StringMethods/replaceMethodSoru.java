package day13StringMethods;

import java.util.Scanner;

public class replaceMethodSoru {
    public static void main(String[] args) {

        //input:xcodex   output :acodex düzenle

        System.out.println("Enter a word");
        String word=new Scanner(System.in).next();
        if (word.charAt(0)=='x'){
            word=word.replaceFirst("x","a");

        }
        System.out.println("word = " + word);
        System.out.println("---------------------");

        System.out.println("isminizi girin");
String word1=new Scanner(System.in).next();
        if (word1.charAt(0)=='a'){
            word1=word1.replaceFirst("a","m");

        }
        System.out.println(word1);
        }


}
