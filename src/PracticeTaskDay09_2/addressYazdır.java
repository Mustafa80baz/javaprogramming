package PracticeTaskDay09_2;

import java.util.Scanner;

public class addressYazdır {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Welcome to the patient portal!\n" +
                "Please enter your personal information");

        System.out.println("Enter your firstName");
        String name = scan.nextLine();
        System.out.println("Enter your lastName");
        String lastName = scan.nextLine();

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String  street = scan.nextLine();
        System.out.println("Enter your city");
        String  city = scan.nextLine();
        System.out.println("Enter your zipcode");
        String zipcode = scan.nextLine();
        System.out.println("Enter your work   phone number");
        int phoneNumber = scan.nextInt();

        System.out.println("Enter oyur personel   phone number");
        int personelPhoneNumber = scan.nextInt();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter oyur height");
        double height = scan.nextDouble();

        System.out.println("Enter oyur weight");
        double weight = scan.nextDouble();
 ;
        System.out.println("Are you married");
        boolean Ismarried= scan.nextBoolean();







    }
}
