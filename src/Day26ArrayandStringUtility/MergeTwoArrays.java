package Day26ArrayandStringUtility;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int []array1={1,2,3};
        int []array2={4,5,6,7};
        int[] arr3=merge(array1,array2);
        System.out.println(Arrays.toString(arr3));

    }
    public static int[]merge(int[] array1,int[]array2){
    int[] result=new int[array1.length+ array2.length];

    int i=0;
        for (int each : array1) {
            result [i++]=each;

        }
        for (int each : array2) {
            result [i++]=each;

    }
        return result;
}
}