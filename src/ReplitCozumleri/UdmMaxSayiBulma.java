package ReplitCozumleri;

import java.util.Scanner;

public class UdmMaxSayiBulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı git");
        int a= scan.nextInt();
        System.out.println("ikinci sayı gir");
        int b= scan.nextInt();
        System.out.println("bir sayı daha gir");
        int c= scan.nextInt();
     if (a>b && a>c){
         System.out.println("max number : "+a);
     } else if (b>c && b>a) {
         System.out.println("max number :"+b);

     } else if (c > a && c > b) {
         System.out.println("max number"+ c);
     }else {
         System.out.println("sayılar eşittir");
     }


    }
}
