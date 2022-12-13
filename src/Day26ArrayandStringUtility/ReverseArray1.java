package Day26ArrayandStringUtility;

import java.util.Arrays;

public class ReverseArray1 {
    public static void main(String[] args) {
        int []number={1,2,3,4,5};
    int[] ber= reverseArray(number);
        System.out.println(Arrays.toString(ber));
    }


    public static int []reverseArray(int [] array){//{1,2,3,4,5}
        int[] result=new int[array.length];
        for (int i = array.length-1,j=0; i>=0  ; i--,j++) {
            result [j]=array[i];

        }
return result;
    }

}
