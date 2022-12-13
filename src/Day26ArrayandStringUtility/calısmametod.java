package Day26ArrayandStringUtility;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class calısmametod {
    public static void main(String[] args) {
        int []array1={1,2,3};
        int []array2={4,5,6};
        int[] arrason=merge(array1,array2);
        System.out.println(Arrays.toString(arrason));
    }
public static int []merge(int[]array1,int []array2){
        int[] result= {};
    for (int each : array1) {
       result= ArraysUtility.addelement(result,each);

    }
    for (int each : array2) {
        result=ArraysUtility.addelement(result,each);

    }
    return result;

}


}
