package Day21ArrayMetods;

import java.util.Arrays;

public class ArrayUtilityiesToStringMethod {
    public static void main(String[] args) {
        int [] num={1,2,3,45,5};
       // System.out.println(num);//sadece hasdeccode yazdırır.[I@511baa65=hashdeck code
        System.out.println(Arrays.toString(num));//[] içindekileri yazdırmak için to string cagırmak lazım sonuc string dir
//{} Arrayin içini tamamını yazdıracagımız zaman to string cagır
        System.out.println(num[1]);//burada belirli bir elementi yazdıracagı için to sttring e gerek yok
        //num[0] karşılıgı= 1 dir direk yazdırır

        System.out.println("------");
    }
}
