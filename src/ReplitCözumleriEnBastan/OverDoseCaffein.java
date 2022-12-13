package ReplitCözumleriEnBastan;

import java.util.Scanner;

public class OverDoseCaffein {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of milligram in drink");
        int numberofmilligam= scan.nextInt();
        int lethalDirnkcount=10*1000/numberofmilligam;//ölumcul dose un formulu;
        System.out.println(lethalDirnkcount);

    }
}
