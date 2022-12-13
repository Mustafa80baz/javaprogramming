package Day19Loop;

import java.util.Scanner;

public class ExitMethotOrnek2OddorEven {
    public static void main(String[] args) {
        while (true){
        Scanner scan=new Scanner(System.in);
            System.out.println("enter a number");
        int num1= scan.nextInt();
        if (num1%2==0){
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }
        System.out.println("would you like to enter a new number");
        String as= scan.next().toLowerCase();
        if (!(as.equals("yes") || as.equals("no"))){
            System.exit(0);

            if (as.equals("no")){
                System.out.println("tamam cık dışarı");
                break;
            }

        }
    }
}
}