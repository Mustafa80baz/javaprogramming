package ReplitCozumleri;

import java.util.Scanner;

public class BedroomLeasing {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        for (int i = 0; i < a; i++) {

            if (i==4){
                System.out.println(i+1+".Numan");
            }else {
                System.out.println(i+1+". Merhaba");
            }
            System.out.println("r = " + i);

        }
        System.out.println("**************************");



    }

}
