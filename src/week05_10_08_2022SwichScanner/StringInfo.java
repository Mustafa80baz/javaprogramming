package week05_10_08_2022SwichScanner;

import java.util.Scanner;

public class StringInfo {
    public static void main(String[] args) {
        // we can create String two diffrent ways
        // 1.String literal 1. yolu

        Scanner scan=new Scanner(System.in);
        String a="Kazım";// bu ikisi string pool da yer alır ve birbirine eşittir,
        String b="Kazım";
        System.out.println(a==b);
        System.out.println("-------------------------------");
        //2. yolu= new keyword // new keyword kullanıldıgında  heap içinde farklı yerlerde store ediklirler ve eşit değillerdir.
        String str1=new String("Kazım");
        String str2=new String("Kazım");
        System.out.println(str1==str2);


    }
}
