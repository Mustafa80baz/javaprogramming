package day13StringMethods;

import java.util.Scanner;

public class MyInfoTask {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter your age");
        int age= scan.nextInt();
        System.out.println("enter your gender");
        String gender= scan.next();
                scan.nextLine();
        System.out.println("enter full name");
        String fullname= scan.nextLine();
        System.out.println("enter your phone number"); //long
        long phonenumber= scan.nextLong();
        System.out.println("enter your zipcode");
        int zipcode= scan.nextInt();
        scan.nextLine();
        System.out.println("enter your school name");
        String schoolName= scan.nextLine();
        System.out.println("enter your city name");
        String city=scan.nextLine();
        System.out.println("enter your state name");
        String state=scan.next();
        scan.nextLine();
        System.out.println("enter your buliding number");
        int buldingNumber= scan.nextInt();
        scan.nextLine();
        System.out.println("enter your street name");
        String street=scan.nextLine();
        scan.close();

        System.out.println("fullname = " + fullname);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phonenumber : " + phonenumber);
        System.out.println("Address:\n\t" +buldingNumber+" "+street+"\n\t "+city+","+state+","+zipcode);
        System.out.println("schoolName = " + schoolName);


    }
}
