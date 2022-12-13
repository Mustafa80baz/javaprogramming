package Day26ArrayandStringUtility;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class MergetwoArrays2 {
    public static void main(String[] args) {
        int []array1={1,2,3};
        int []array2={4,5,6};
        int[] arrason=merge(array1,array2);
        System.out.println(Arrays.toString(arrason));
    }
    public static int[] merge(int[] array1,int[] array2){
        int []result={};

        for (int each : array1) {
       result= ArraysUtility.addelement(result,each);

        }
        for (int each : array2) {
            result= ArraysUtility.addelement(result,each);

        }
        return result;
    }

    public static double[] merge(double[] array1,double[] array2){
        double []result={};

        for (double each : array1) {
            result= ArraysUtility.addelement(result,each);

        }
        for (double each : array2) {
            result= ArraysUtility.addelement(result,each);

        }
        return result;
    }

    public static char[] merge(char[] array1,char[] array2){
        char []result={};

        for (char each : array1) {
            result= ArraysUtility.addelement(result,each);

        }
        for (char each : array2) {
            result= ArraysUtility.addelement(result,each);

        }
        return result;
    }


    public static String[] merge(String[] array1,String[] array2){
        String []result={};

        for (String each : array1) {
            result= ArraysUtility.addelement(result,each);

        }
        for (String each : array2) {
            result= ArraysUtility.addelement(result,each);

        }
        return result;
    }


}
