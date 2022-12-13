package Day18NestedLoop;

import java.util.Scanner;

public class NestedLoOPractiseEligibleAlkohol {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       while (true){
           System.out.println("Please enter your age");
           int age = scan.nextInt();

           while (!(age>=1  && age <=120)){
               System.out.println("Invali,d age please re enter");
               age = scan.nextInt();
            }
           System.out.println("Would you like to continue");
           String answ= scan.next().toLowerCase();
           while (!(answ.equals("yes")  || answ.equals("no"))){
               System.out.println("Invalid answer please re enter, Wolud you like to continue");
               answ= scan.next().toLowerCase();
           }
           if (answ.equals("no")){
               break;
           }
scan.close();
        }
    }
}
