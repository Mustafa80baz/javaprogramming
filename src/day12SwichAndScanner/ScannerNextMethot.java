package day12SwichAndScanner;

import java.util.Scanner;

public class ScannerNextMethot {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("please Enter your name");
        String name= input.next();// sadece ilk boşluğa kadar okur//Mustafa baz yazarsan mustafa yı okur baz ı okuyamaz
        System.out.println("name = " + name);
        input.close();
    }
}
