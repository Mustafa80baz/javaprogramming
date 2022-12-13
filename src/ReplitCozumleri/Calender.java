package ReplitCozumleri;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter month number:");
        int monthNum = scan.nextInt();
if (monthNum==1){
    System.out.println("January");

    } else if (monthNum==2) {
    System.out.println("February");
    } else if (monthNum==3) {
    System.out.println("March");

} else if (monthNum==4) {
    System.out.println("April");

    } else if (monthNum==5) {
    System.out.println("May");

} else if (monthNum==6) {
    System.out.println("june");
} else if (monthNum==7) {
    System.out.println("july");
} else if (monthNum==8) {
    System.out.println("Augoust");
} else if (monthNum==9) {
    System.out.println("December");
} else if (monthNum==10) {
    System.out.println("October");
} else if (monthNum==11) {
    System.out.println("November");
}else if(monthNum==12) {
    System.out.println("December");
}else {
    System.out.println("invalid ");
}


    }
}
