package Day21ForEachLoop;

import java.util.Arrays;

public class AnagramTask {
    public static void main(String[] args) {

        String str1="acdb";
        String str2="dbca";
        //write a program taht can check if str1 and str2 are build out same characters
//çözüm  = önce tochararray yapacaz ikisini de

        char[] ch1 =str1.toCharArray();//array Satring e dönüştürduk
        char []ch2=str2.toCharArray();//array Satring e dönüştürduk
        Arrays.sort(ch1);
        Arrays.sort(ch2);
boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);


    }
}
