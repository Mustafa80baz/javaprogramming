package Day13Practise1;

import java.util.Scanner;

public class LoginAplication {
    public static void main(String[] args) {
        //user=Cydeo  paswrd=WoodenSpoon
        Scanner scan=new Scanner(System.in);

        System.out.println( "Enter user name");
        String user= scan.nextLine();
        System.out.println("Enter pasword");;
        String pasword=scan.nextLine();

        if (user.equals("Cydeo") && pasword.equals("WoodenSpoon")){
            System.out.println("You Logged in");
        }else {
            System.out.println("Incorrect username or password");
        }

    }
}
