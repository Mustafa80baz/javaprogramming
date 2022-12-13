package day13StringMethods;

import java.util.Scanner;

public class InitialsStringClass {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

       // System.out.println("Enter your firs name");
        //String firstName= scan.next();// Java
        //System.out.println("enter your last name");
        //String lastname= scan.next();

        //char f=firstName.charAt(0);
        //char l =lastname.charAt(0);
        //String initial=""+f+l;
        //System.out.println("initial = " + initial);
//scan.close();
        System.out.println("-----------------------------");
        System.out.println("Enter your school name we gona look");
        scan.nextLine();
        String  school= scan.next();
        scan.nextLine();
        char scol=school.charAt(0);
        char kjd=school.charAt(school.length()-1);






    }
}
