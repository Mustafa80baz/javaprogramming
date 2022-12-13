package Day18NestedLoop;

import java.util.Scanner;

public class AdditionalTwoNumbersNestedloppr {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true){
        System.out.println("enter oyur first number");
        int num1= scan.nextInt();
        System.out.println("enter your second number");
        int num2= scan.nextInt();
        System.out.println("Additional : "+(num1+num2));

        System.out.println("Would you like to continue");
        String answer= scan.next().toLowerCase();
        while (!(answer.equals("yes")  || answer.equals("no"))){
            System.err.println("Invalid answer, Please try again");
            answer=   scan.next().toLowerCase();
        }

    if (answer.equals("no")){
            break;

    }



        }
    }
}
