package week05_10_08_2022SwichScanner;

import java.util.Scanner;

public class CumledenBirPrcayıYazdırma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String sd="Cydeo";// sadece "yde" kısmını yazdır.
        String sd1=sd.substring(1,4);// 4 diyoruz çünki son rakam sayılmıyor hep bir fazla söyle
        System.out.println("sd1 = " + sd1);
        // sadece  "deo" yazdır
        sd.substring(2);
        System.out.println(sd.substring(2));
        System.out.println("--------------------------");

    String ds=scan.next();
        System.out.println(ds.substring(1,4));
        System.out.println("-------------------------");
        String cd= scan.next();
        System.out.println(cd);


    }
}
