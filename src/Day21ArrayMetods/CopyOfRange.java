package Day21ArrayMetods;

import java.util.Arrays;

public class CopyOfRange {
    public static void main(String[] args) {
        char[] ch={'A','B','C','D','E','F','G','H','I'};
        char []ch1= Arrays.copyOfRange(ch,2,6);
        System.out.println(Arrays.toString(ch1));

        System.out.println("-----------------------------------------------");

        int []scores={10,20,30,40,50,60,70,80,90,100};
        int [] score1=Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(score1));
        int[] score2=Arrays.copyOfRange(scores,3,scores.length);//biryerden başlayıp sonuna kadar yazıdrma
        System.out.println(Arrays.toString(score2));



    }
}
