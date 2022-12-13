package Week08_29_10_2002ArrayOwerview;

import java.util.Arrays;

public class ArrayPractisetask_Rotated {
    public static void main(String[] args) {
        /*
        Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left”

        int[] x = {1,2,3};             // = > [2,3,1] Sıralamasını değiştirecegiz
        int[] y = {17,12,10,8};         // = > [12,10,8,17]
        int[] a = {7,0,0};              // = > [0,0,7]
         */
        int[] x = {1,2,3};   int[] y = {17,12,10,8};int[] a = {7,0,0};

        int temp=x[0];
        for (int i = 0; i < x.length-1; i++) {
            x[i]=x[i+1];

        }
        x[x.length-1]=temp;
        System.out.println(Arrays.toString(x));


    }
}
