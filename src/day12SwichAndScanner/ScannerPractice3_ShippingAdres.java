package day12SwichAndScanner;

import java.util.Scanner;

public class ScannerPractice3_ShippingAdres {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        /*soru:Kargo Adresi yadırma veiler
        1.adınızı yazınız  2.bina numarası  3,cadde adı  4_şehir adı   5-ülke adı   6- posta kodu

         */

        System.out.println("Adınız giriniz");
        String adi = input.nextLine();

        System.out.println("Bina  numasarını girin");
        int no= input.nextInt();
                input.nextLine();
        System.out.println("cadde adınıı yazın");
        String cadde= input.nextLine();

        System.out.println("Şehir adı");
        String sehir= input.nextLine();

        System.out.println("Ulke adı");
        String ulke= input.nextLine();

        System.out.println("posta kodu");
        int posta= input.nextInt();
input.close();
        System.out.println("adi = " + adi);
        System.out.println("no = " + no);
        System.out.println("cadde = " + cadde);
        System.out.println("sehir = " + sehir);
        System.out.println("ulke = " + ulke);
        System.out.println("posta = " + posta);


    }
}
