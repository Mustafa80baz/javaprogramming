package day12SwichAndScanner;

import java.util.Scanner;

public class scannerPraactice2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        //ask for age   2_ask for full name

        System.out.println("Enter your age");
        int age=input.nextInt();

        input.nextLine();
        System.out.println("Enter your full name");
        String name = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);

    }
}
