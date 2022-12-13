package Day27WrapperClass;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arrae1={1,1,2,2,3,4,5};
        arrae1=removeDuplicate(arrae1);
        System.out.println(Arrays.toString(arrae1));
        System.out.println("--------------------stringexample---");

        double[] aarrae1={1.2,1.2,2.2,2,3.2,4.2,5.2};
        aarrae1=removeDuplicate(aarrae1);
        System.out.println(Arrays.toString(aarrae1));

    }

    //
    public static int[] removeDuplicate(int []array){
        int []result={};
        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addelement(result,each);
            }

        }
        return result;
    }

    public static double[] removeDuplicate(double []array){
        double []result={};
        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                ArraysUtility.addelement(result,each);
            }

        }
        return result;
    }
    public static char[] removeDuplicate(char []array){
        char []result={};
        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addelement(result,each);
            }

        }
        return result;
    }

    public static String[] removeDuplicate(String []array){
       String []result={};
        for (String each : array) {

            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addelement(result,each);

        }

            }
        return result;
        }

    }

