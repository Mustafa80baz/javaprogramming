package day15StringMethoad;

import java.util.Scanner;

public class ContainsMethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a sentences");
        String a= scan.next();
       // String a="My favorite programming language is Java ";
        //soru cumlemiz c# iceriyor mu
        boolean hasCsharp=a.contains("C#");
        System.out.println("hasCsharp = " + hasCsharp);// false cumled yok  kı C#
        boolean hasjava=a.contains("Java");
        System.out.println("hasjava = " + hasjava);
        //eger buyuk kucuk duyarlı olamdan aradığımız kelimeyi bulsun istersek önce arama cumleıni(boollean)ı string  yap
       // boolean java2=a.""toLowerCase()""// bu string arama ve buyuk kucuk ceveirme programı
        boolean java2=a.toLowerCase().contains("java");
        System.out.println(java2);
        System.out.println("---------------------------------------");
        String input1="I love Java";// equals da cumlede kac harf var a bakar
        String input2="java";
        boolean sw=input1.equals(2);
        System.out.println("sw = " + sw);// false cünkı equll da tüm cumleyi input 2 ile karşılaştırıyor o da eşit değil
        boolean ws=input1.equalsIgnoreCase(input2);
        System.out.println("ws = " + ws);// yine cumleyı karşılastırır yıne tutmaz
        System.out.println("-------------------");
        boolean de=input1.contains("Java"); //bunu içeriyor
        System.out.println("de = " + de);
        System.out.println("--------------------");
   // diyelilk ki ilk cumlede jAvA buyuk kucuk karısık yazılmış içeriyor mu dicez.harf duyarlılığını nasıl kaldırırız

        String input11="I love JAvA";
        String input12="Java";
        //bunlar eşit değil  aynısını da içermez cevabı verır ne yapacaz.
        boolean bg=input11.toLowerCase().contains("java");// true
        boolean fg=input11.toUpperCase().contains("JAVA");
        System.out.println("bg = " + bg);//true
        System.out.println("fg = " + fg);//true ikisinde de true veri



    }
}
