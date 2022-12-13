package Day21ArrayMetods;

import java.util.Arrays;

public class SortMethodNumbers {
    public static void main(String[] args) {
        // sort=sort the array in ascending order küçükten buyuge buyukten kucuge
        int scores[]={95,100,55,65,85,78};
      Arrays.sort(scores);//sıraya koyar
        System.out.println(Arrays.toString(scores));//sıraya konulmuş halini yazdırır
        System.out.println("minimum Score :"+scores[0]);
        System.out.println("maximum Score :"+scores[scores.length-1]);
    }




}
