package UDMİDÖNGÜLER;

import java.util.Scanner;

public class Faktörel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println(" bır sayı girin");
      //  int faktorel=1;
       // int sayı= scan.nextInt();
        //for (int i = 1; i <=sayı ; i++) {
      //      faktorel *=i;

       // }
       // System.out.print("   faktorel =   " + faktorel);

        int sc= scan.nextInt();
        int fat=1;
        for (int i = 1; i <=5; i++) {
            fat*=i;


        }
        System.out.println("fat = " + fat);
    }
}
