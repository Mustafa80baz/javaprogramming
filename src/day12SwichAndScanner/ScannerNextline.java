package day12SwichAndScanner;

import java.util.Scanner;

public class ScannerNextline {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your name and sirname");
        String namefull= input.nextLine();//herşeyi okur
        System.out.println("namefull = " + namefull);

        System.out.println("------------------------");

        System.out.println("Enter your name and sirname");
        String fulname =input.nextLine();

        System.out.println("enter your programing language");
        String programName= input.nextLine();

        System.out.println("enter your age");
       int age= input.nextInt();
        input.nextLine();
        System.out.println("Enter your okul adı");
        String okul= input.nextLine();
        System.out.println("fulname = " + fulname);
        System.out.println("programName = " + programName);
        System.out.println("age = " + age);
        System.out.println("okul = " + okul);


    }
}
