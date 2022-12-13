package Day20Array;

import java.util.Arrays;

public class ArrayPracticeInteger1 {
    public static void main(String[] args) {
        int [] num={10,20,50,70};//elementleri biliyoruz
        System.out.println(Arrays.toString(num));

        System.out.println("--------------------------");
        //crate a verailble that can contains5 score

        int []num2=new int[5];
      num2[1]=85;
      num2[num2.length-1]=95;//last yani 5 in karşılıgı=95
        num2[3]=75;
        num2[0]=65;
        num2[2]=55;
        int tep=0;
        System.out.println(Arrays.toString(num2));//tanımlama sırasına göre yazdırır
       Arrays.sort(num2);
        System.out.println(Arrays.toString(num2));//kendi içinde buyukten kucuge sıraladma

    }
}
