package ReplitCozumleri;

import java.util.Scanner;

public class ArcYakıtHesabı {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kac km gittniz yazın");;
        int km= scan.nextInt();
        System.out.println("kac para yaktı giriniz");
        double yakı=scan.nextDouble();
         double neyakıyor=yakı/km;
        System.out.println("neyakıyor = " + neyakıyor);


    }


}
