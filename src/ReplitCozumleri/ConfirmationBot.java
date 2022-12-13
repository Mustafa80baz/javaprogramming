package ReplitCozumleri;

import java.util.Scanner;

public class ConfirmationBot {
    public static void main(String[] args) {
        /*
  Use a `switch statement` to create a confirmation bot. Given a `response` value as a `char`, output a message based on the  following:
 if the response is y print the message:`Your request is being processed`-if the response is `n` print the message:`Thank you for your consideration`
> - if the response is `h` print the message: `Sorry, no live agents are currently available`
> - if the response is anything other than `y, n, or h` print: `Invalid entry, please try again`
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("enter your respond y/n");
char respond= scan.next().charAt(0);


        switch (respond){

            case 'y':
                System.out.println("Your request is being processed");
                break;

            case 'n':
                System.out.println("Thank you for your consideration");
                break;
            case 'h':
                System.out.println("Sorry, no live agents are currently available");
                break;
            default:
                System.out.println("Invalid entry, please try again");
        }


    }

}
