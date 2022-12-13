package ReplitCözumleriEnBastan;

import java.util.Scanner;

public class SaniyeGirsaatıbul {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" enter a secon number");
        int second= scan.nextInt();
      /*
      1 hour=60 minutes and 3600 seconds
      1 minute =60 seconds   60 second=1 minute
      3700 second =1 hour 1 minute 40 second  nasıl buluyoruz
      */
        int hour=second/3600;// sati buluruz ama saniyeyi vermez

        int saattenSonsonraSanıye=second%3600;// 100 sanıyeyi verecek
        System.out.println(saattenSonsonraSanıye);
        int minute= saattenSonsonraSanıye/60;// 1 dakikayı
        int second1=saattenSonsonraSanıye%60;//dakikadan sonra kalan 40 saniyeyi verir
        System.out.println(hour+" hour, "+minute+" minute,and "+second1+" second ");


    }
}
