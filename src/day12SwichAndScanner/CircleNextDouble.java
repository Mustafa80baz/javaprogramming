package day12SwichAndScanner;

import java.util.Scanner;

public class CircleNextDouble {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //ask the use to enter radius of circle,Caşcualte the area and primeter of the circle by using teh radius

        System.out.println("enter circul radious");
        double r=input.nextDouble();

        double area=r*r*3.14;
        double primeter=2*r*3.14;
        System.out.println("area = " + area);
        System.out.println("primeter = " + primeter);
        input.close();
        System.out.println("-----------------------------");

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your browser name");
        String broser= scan.nextLine();
        switch (broser){
            case "firefox":
                System.out.println("dikkat et");
                break;
            case "chrome":
                System.out.println("jnscçjsd");
                break;
            case "hotfile":
                System.out.println("o n elaa");
                break;
            default:
                System.out.println("gecersiz");

        }
    }




}
