package day13StringMethods;

import java.util.Scanner;

public class CokOnemliVeGüzeldenemtewr {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
     //1-bir cumle yaz 2-4.harfini bul3-toplam kac harf 4-son harfi
      String a="bir cümle ne kadar uzun olabilir var gör";//yazıldı
      char harf=a.charAt(4);
        System.out.println(harf);//4. harfini buldu 'C'
        int toplam =a.length();//har sayısı bulma formulü
        System.out.println(toplam);// 40 harf varmış
        char sonharf=a.charAt(a.length()-1);//son harf formulu
        System.out.println("sonharf = " + sonharf);//son harf 'r'

        System.out.println("--------------------------------");
        String aile="beş kişiyiz numan salıh nihal ve anne baba";
        int kacharf=aile.length();
        System.out.println("kacharf = " + kacharf);//42 harf var
        char harfi=aile.charAt(5);//5.harfi ne?
        System.out.println("harfi = " + harfi); //"i"
        char sonharfi=aile.charAt(aile.length()-1);// formul
        System.out.println("sonharfi = " + sonharfi);//son harfi "a"
        System.out.println("-----------------------------------");
    String se="okulda çalısıyorum sen nerdesşlkj c";
    int harfsay=se.length();
      System.out.println(harfsay);
      char hrf=se.charAt(4);
      System.out.println(hrf);
      char sonhrf=se.charAt(se.length()-1);
      System.out.println("sonhrf : "+sonhrf);
      System.out.println("--------------------------------");
      String sa ="Kübra Nihal";
      sa=sa.toUpperCase();
      System.out.println(sa);





    }
}
