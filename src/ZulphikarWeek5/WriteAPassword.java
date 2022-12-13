package ZulphikarWeek5;

import java.util.Scanner;

public class WriteAPassword {
    public static void main(String[] args) {
        String pass1="Cydeo";
        Scanner scan=new Scanner(System.in);

        int guessNo=0;
        while (true){
            System.out.println("Please enter your password");
            String pass= scan.nextLine();
            if (pass.equals("Cydeo")){
                System.out.println("You logged in");
                break;
        }
       guessNo++;
      if (guessNo==3){
          System.out.println("Your account bloked");
          break;

        }


    }
}
}