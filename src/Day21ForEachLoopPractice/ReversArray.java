package Day21ForEachLoopPractice;

import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {
        int []numbers={10,20,30,40,};
        int[] reversed=new int[numbers.length];//yukardaki element kadar kapasitesi oldugundan emin olmak için bunu yazdık.
        // Artık yukarı numbers a nekadar element koyarsan koy

        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
    reversed[j]=numbers[i];

        }
        System.out.println(Arrays.toString(reversed));
        }
    }

