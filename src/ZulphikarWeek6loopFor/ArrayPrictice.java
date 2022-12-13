package ZulphikarWeek6loopFor;

import java.util.Arrays;

public class ArrayPrictice {
    public static void main(String[] args) {
        int [] number=new int[10];
        number [0]=1;
        number [1]=2;
        number [2]=3;
        number [3]=4;
        number [4]=5;
        number [5]=6;
        number [6]=7;
        number [7]=8;
        number [8]=9;
        number [9]=10;
        System.out.println(Arrays.toString(number));
        int even=0;
        int odd=0;
        for (int i = 1; i <=9; i++) {
                           number[i]=i;

        }
        for (int i = 0; i < 10; i++) {
            if (i%2==0){
                even+=i;
            }else {
                odd+=i;
            }

        }
        System.out.println(even);
        System.out.println(odd);
    }


}
