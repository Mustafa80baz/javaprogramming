package Day18NestedLoop;

import java.util.Scanner;

public class Loogin {
    public static void main(String[] args) {
        //write prog.for the log in function of the Cydeo Application, assume that your credentials are;
        //username=Cydeo    password=WoodenSpoon
        /*
        ask user enter their user Id,if Id matched you are "Logged in"
        ıf not matched
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your user");
        String u= scan.next();
        System.out.println("enter your password");
        String ps= scan.next();
        if (u.equals("Cydeo")  && ps.equals("WoodenSpoon")){
            System.out.println("Looged in");

        }else {
            for (int i = 1; i <3 ; i++) {
                System.out.println("Incorrect user or Paswor");
                System.out.println("Enter your username: ");
                u= scan.next();
                System.out.println("enter your password");
                ps= scan.next();
                if (u.equals("Cydeo")  && ps.equals("WoodenSpoon")){
                    System.out.println("Looged in");
                    break;
                }

            }
            if (!u.equals("Cydeo")  && ps.equals("WoodenSpoon")){

        }
            System.out.println("Your account is blocked");
    }
        scan.close();
}
}