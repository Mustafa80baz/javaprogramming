package Day13Practise1;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you want split Yes Or No");
        String split= scan.next().toLowerCase();
        System.out.println("Enter the number of people");
        int numberpeople= scan.nextInt();
        System.out.println("enter the check amount");
        double amount= scan.nextDouble();

        System.out.println("enter servis quality");
        String service= scan.next().toLowerCase();
        double tiprate=(service.equals("exelent"))?0.25:(service.equals("greate"))?0.2:(service.equals("good"))? 0.15 :
                (service.equals("fair"))?0.1:0.05;
        double totaltip=amount*tiprate;
        System.out.println("number of people entered:"+numberpeople);
        System.out.println("Total to  pay: "+amount);
        System.out.println("total tip: "+totaltip);
        if (split.equals("yes")){
            System.out.println("total person:"+(amount+numberpeople));
            System.out.println("tip per person :"+(totaltip/numberpeople));
        }

    }
}
