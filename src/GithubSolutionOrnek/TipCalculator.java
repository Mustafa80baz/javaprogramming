package GithubSolutionOrnek;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        /*
        There will be diffrent service quality benchmark that will determine the tip given
        There will also the ability to calculate based on the
         number of the people in the perty if there is a split of the bill
        poor=5%, Fair=10%,Good=15%,Great =20%, Excellent=25%
        the program should disply the following information based on user input
        Split or no Split(yes or No)        Number of people entered:(number)        Check amount:(number)
        Service Quality(String)        And Display
        Number of people entered:        Total to pay:        Totaal tip:        Total per person:
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Split or No Split(Yes or No)?");
        String YesorNo= scan.next().toLowerCase();

        System.out.println("Number of people:");
        int numOfPeople= scan.nextInt();

        System.out.println("Enter the chek amount:");
        double cehcamount= scan.nextDouble();
        //double tiprate=(service.equals("excellent"))? 0.25 :(service.equals("greate"))? 0.2:
         //       (service.equals("good"))? 0.15:(service.equals("fair"))? 0.1:0.05;
        System.out.println("Service Qualitiy?(Excellent/Greate/good/Fair/poor");
        String service= scan.next().toLowerCase();
       double tiprate=(service.equals("Excellent")? 0.25: (service.equals("Greate"))? 0.20:(service.equals("good"))? 0.15:
               (service.equals("fair"))? 0.10:0.05);
        double totaltip=cehcamount*tiprate;
        System.out.println("numOfPeople = " + numOfPeople);
        System.out.println("Total to pay = " + cehcamount);
        System.out.println("totaltip = " + totaltip);

        //if (yesOrNo.equals("yes")){
            System.out.println("numOfPeople = " +(cehcamount/numOfPeople));

        }
    }

