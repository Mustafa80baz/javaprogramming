package Quiz2;

import java.util.Scanner;

public class IkinciQuizSorulari{
    public static void main(String[] args) {

             // day of week
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number:");
        int day = scan.nextInt();
         String day1 =" ";
        if (day>=1 && day<=7){
            switch (day){
                case 1:
                    day1=("Monday");
                    break;
                case 2:
                    day1=("Tuesday");
                    break;
                case 3:
                    day1=("Wendsday");
                    break;
                case 4:
                    day1=("Tursday");
                    break;
                case 5:
                    day1=("Friday");
                    break;
                case 6:
                    day1=("Sturday");
                    break;
                case 7:
                System.out.println("Sunday");
            }
            System.out.println("day = " + day1);

        }else{

            System.out.println("Not a valid day");
        }




    }
    }

