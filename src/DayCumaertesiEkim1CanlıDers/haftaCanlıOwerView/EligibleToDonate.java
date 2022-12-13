package DayCumaertesiEkim1CanlıDers.haftaCanlıOwerView;

import java.util.Scanner;

public class EligibleToDonate {
    public static void main(String[] args) {
        /*
        crate a program accept age and weight as int.
        if age greather than or equal 18 and weight greather than 50 kg give message
        Expect:"You are not eligible to donate blood"

        if age is smaller than 18 "Age must be greather than 18"
        Expect:"Age must be greather than 18"
         */

        Scanner scan =new Scanner(System.in);

        System.out.println("please enter your age ");
        int age= scan.nextInt();

        System.out.println("please enter yout weight");
        int weight=scan.nextInt();

        if (age>=18){ // we checked age is greater tah or equal 18
            if (weight>50){
                System.out.println("You are eligible to donate blood");
            }else {
                System.out.println("You are not eligible to donate blood");
            }




        }else{ //  age is smaller than 18


            System.out.println("Age must be greater than 18");

    }

}
}
