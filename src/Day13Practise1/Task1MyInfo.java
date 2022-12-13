package Day13Practise1;
import java.util.Scanner;
public class Task1MyInfo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");;
        int age= scan.nextInt();
        System.out.println("Enter your gender");;
       String gender=scan.next();
        scan.nextLine();
        System.out.println("Enter your full name");;
        String fullname = scan.nextLine();
        System.out.println("Enter your phone number");
     long phone= scan.nextLong();
            scan.nextLine();
        System.out.println("Enter your zipcode");
        int zipcode=scan.nextInt();
                 scan.nextLine();
         System.out.println("enter your school name");
        String school= scan.nextLine();
        System.out.println("enter your city name");
        String city =scan.nextLine();
        System.out.println("enter your state name");
        String state=scan.next();
        System.out.println("enter bulg number");
        int buld=scan.nextInt();
        scan.nextLine();
        System.out.println("enter address");
        String ad=scan.nextLine();
        System.out.println("enter your street");
       String street=scan.nextLine();
        String adress=fullname+" "+age+gender+phone+" "+ad+"\n"+"\t\t\t\t\t\t"+buld+"\n"+zipcode+"\t\t\t\t\t\t"+city+state+"\n\t\t\t\t\t\t\t";

        System.out.println(adress);




    }
}
