package day13StringMethods;

import java.util.Scanner;

public class StringIntroEqual {
    public static void main(String[] args) {
        //string class is for char sequences
        String name="Wooden Spoon";//4 satırın karşılığında tek bir wooden spoon yer alır o da heap te
        String name1="Wooden Spoon";
        String name2="Wooden Spoon";
        String name3="Wooden Spoon";
        System.out.println(name==name1);
        System.out.println(name1==name2);//bunları karşılastırmasın da hepsine true verir
        System.out.println(name==name3);
        System.out.println(name3==name1);

        System.out.println("----------------------------------");
        String str =new String("wooden spoon");
        String str1=new String("Wooden spoon");
        // bunlar her biri ayrı bir veri heap te ayrı ayrı yer alır ve karşşılaştırmasında false çıkar

        System.out.println(str==str1);//false
        System.out.println("------------------------------------");
        String s1="Java";
        String s2=new String("Java"); //burada true verir ama birisi büyük(J) biri küçük(j) olsa false verir.
        System.out.println(s1.equals(s2));

        System.out.println("-----------------------------------");
        Scanner s=new Scanner(System.in);
        String word=s.next();
        word.toLowerCase();
    }

}
