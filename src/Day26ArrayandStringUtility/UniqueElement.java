package Day26ArrayandStringUtility;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {
        int[] array={1,1,2,3,3,4,5,5,6,7,7,7};
       int[] uniq= uniqueElement(array);
        System.out.println(Arrays.toString(uniq));
    }
//Returns the unique element from the given array
    public static int[]uniqueElement(int []array){
        int []result={};
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){//unique olanı bulur
    result=ArraysUtility.addelement(result,each);//bunu result arrayaın içine yazar
            }

        }
        return result;
    }
    //Returns the unique element from the given array
    public static double[]uniqueElement(double []array){
        double []result={};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){//unique olanı bulur
                result=ArraysUtility.addelement(result,each);//bunu result arrayaın içine yazar
            }

        }
        return result;
    }
    //Returns the unique element from the given array
    public static char[]uniqueElement(char []array){
        char []result={};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){//unique olanı bulur
                result=ArraysUtility.addelement(result,each);//bunu result arrayaın içine yazar
            }

        }
        return result;
    }
    //Returns the unique element from the given array
    public static String[]uniqueElement(String []array){
        String []result={};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){//unique olanı bulur
                result=ArraysUtility.addelement(result,each);//bunu result arrayaın içine yazar
            }

        }
        return result;
    }

}
