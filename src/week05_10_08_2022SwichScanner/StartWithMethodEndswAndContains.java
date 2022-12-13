package week05_10_08_2022SwichScanner;

import java.util.Scanner;

public class StartWithMethodEndswAndContains {
    public static void main(String[] args) {
        //Start wirh yazının cahr la başlayıp başlamadıgını kontrol eder

        String sentences="Java is a good Language";
        System.out.println(sentences.startsWith("Java"));
        System.out.println(sentences.endsWith("Language"));
        System.out.println("----------------------------------");
        String sentence1="Java is java";
        sentence1.contains("is");
        System.out.println(sentence1.contains("is"));

        System.out.println("-----------------------------");
        String sa="redxx";
        Scanner input=new Scanner(System.in);
        input.next();
        sa.startsWith("red");
        System.out.println();



    }
}
