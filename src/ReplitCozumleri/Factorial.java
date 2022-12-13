package ReplitCozumleri;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int factorail=1;
        for (int i = 1; i <=n ; i++) {
            factorail *=i;

        }
        System.out.println("factorail = " + factorail);
        }

    }


