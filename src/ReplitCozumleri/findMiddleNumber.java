package ReplitCozumleri;

import java.util.Scanner;

public class findMiddleNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter fist number");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if (a>b &&  a>c  && b<a &&b>c){
            System.out.println("middle number isb dir :"+b);
        } else if (a<b && a<c) {
            System.out.println("orta sayı: b dir");

        } else if (a<b && a>c) {
            System.out.println("middle number "+a);

        } else if (b>a &&b<c) {
            System.out.println("Middle number"+b);

        } else if (b>a  && b>c) {
            System.out.println("Middle number = " + b);

        }else {
            System.out.println("middle number "+c);
        }

    }
}
