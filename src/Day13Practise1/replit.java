package Day13Practise1;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name,answer,guestlist="";
        do {
            System.out.println("Please enter guest name :");
            name = scan.next();
            guestlist +=name;
            System.out.println("do you want to enter new  guest name :");
            answer = scan.next();
            if (answer.equalsIgnoreCase("yes")){
                guestlist +=",";
            }

        } while (answer.equalsIgnoreCase("yes"));
        System.out.println("Guest's  list: "+guestlist);

        }



    }

