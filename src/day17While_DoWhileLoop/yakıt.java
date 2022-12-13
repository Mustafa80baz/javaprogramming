package day17While_DoWhileLoop;

import java.util.Scanner;

public class yakıt {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Kac km gittiniz");
       double a= scan.nextInt();
        System.out.println("kac tl ödediniz");
      double b= scan.nextInt();
   double yakıtkm=a/b;
        System.out.println(yakıtkm);

    }
}
