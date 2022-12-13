package UDMİDÖNGÜLER;

import java.util.Scanner;

public class WhileDöngüsüVeFactorel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //while 1 den 10 na yazdırma
      int a=0;
      while (a<10){
          System.out.print("  a = " + a);
          a++;// tek tek artar  1den 10 yazdırır

        }
        System.out.println();
      int s=10;
      while (s<=100){
          System.out.print(" s =" + s);
          s +=3;
      }
        System.out.println("------------------");
        System.out.println("bır sayı girin");
        int sayı=scan.nextInt();
        int fayasal=1;
        while (sayı>0){
            fayasal *=sayı;
            sayı--;
        }
        System.out.println("fayasal = " + fayasal);
    }
}
