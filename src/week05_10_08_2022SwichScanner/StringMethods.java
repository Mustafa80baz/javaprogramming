package week05_10_08_2022SwichScanner;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // if we want to get specific carakter we must use charArt();
        // bana su numaralı karakteri getir derken charArt() kullanılır

         String str="Adam";
        System.out.println( str.charAt(3));// cevabı a

        //  kac harf var oldugunu çrenmek istıyorsak
         str.length();
         int str1=str.length();
        System.out.println(str1);
        // son harfi alma yolu
        int lang=str.length()-1;
        System.out.println(lang);
        System.out.println("--------------------------");

        //to lowercase yapmak
        System.out.println(str.toLowerCase());
        //to uppercase yapmak
        System.out.println(str.toUpperCase());
        // trim method
        String str2="   adam sam  ";
        str2.trim();
        System.out.println(  str2.trim());// string class is immutable
        System.out.println("------------------");
        //if we want to get to index of char or string we need to  indexOf()  method
        //index0123456;
        String number="0123456";
        System.out.println(number.indexOf('3'));
        //get the index of 56
        System.out.println(number.indexOf("56"));
        //get the index of 14
        System.out.println(number.indexOf("14"));

        String sentence="Java is a programmin language";
        sentence.indexOf("p");
        System.out.println( sentence.indexOf("p"));
// string içinde yazılı olmayan bir karakter indexof() içine yazılıp (fazladan boşluk bırakmak dahil sorulursa -1 verir.

        System.out.println("---------------------------");
        String sentence1="Java is Java";
        System.out.println(sentence1.indexOf("Java"));
        System.out.println(sentence1.lastIndexOf("Java"));

        /*
        Task 1: Given a string, print the string made of its first two chars,
        so the String "Hello" yields “HE".
         */
        String word="Hello";
        String b =""+word.toUpperCase().charAt(0)+word.toUpperCase().charAt(1);
        System.out.println(b);
        String c=""+word.toUpperCase().charAt(2)+word.toLowerCase().charAt(3)+word.toUpperCase().charAt(4);
        System.out.println(c);
        String d="" +word.toUpperCase().charAt(0)+word.toLowerCase().charAt(1)+word.toUpperCase().charAt(2)+word.toLowerCase().charAt(3);
        System.out.println(d);
            }
        }



