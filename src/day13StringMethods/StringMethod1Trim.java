package day13StringMethods;

import java.util.Scanner;

public class StringMethod1Trim {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str1="     mustafa ** baz  **     ";// iki harf yada işaret arası boşluğu
        // almaz sadece satır başı ve sonunda gereksiz boşluk var lır
        str1=str1.trim();
        System.out.println(str1);
        System.out.println("*****************************");

        String bilsem="      b i l s e m                            ";
        System.out.println( bilsem);
        bilsem=bilsem.trim();
        System.out.println("bilsem");

    }
}
