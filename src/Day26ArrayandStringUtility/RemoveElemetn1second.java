package Day26ArrayandStringUtility;

import java.util.Arrays;

public class RemoveElemetn1second {
    public static void main(String[] args) {
        int[] number={100,200,300,400,500,600};
        number=removeElement(number,1);
        System.out.println(Arrays.toString(number));
    }
    //removers the element from array
    public  static int[]removeElement(int []array,int index){
        int[] result=new int[array.length-1];
        int j=0;
        for (int each : array) {
            if (each==array[index]){
                continue;
            }
          result[j++] =each;
        }
        return result;
    }
    public  static double[]removeElement(double []array,int index){
        double[] result=new double[array.length-1];
        int j=0;
        for (double each : array) {
            if (each==array[index]){
                continue;
            }
            result[j++] =each;
        }
        return result;
    }
    public  static char[]removeElement(char []array,int index){
        char[] result=new char[array.length-1];
        int j=0;
        for (char each : array) {
            if (each==array[index]){
                continue;
            }
            result[j++] =each;
        }
        return result;
    }

    public  static String[]removeElement(String []array,int index){
        String[] result=new String[array.length-1];
        int j=0;
        for (String each : array) {
            if (each==array[index]){
                continue;
            }
            result[j++] =each;
        }
        return result;
    }





}
/*
create a method tah passes two parameters :an integer array and an integer index the method removes the element
Ex:int [] arr={10,20,30,40}
remove element arr={10,20,40} kalsın 30 u at
create a method tah passes two parameters :a double array and an integer index the method removes the element
create a method tah passes two parameters :a char array and an integer index the method removes the element
create a method tah passes two parameters :a String array and an integer index the method removes the element

 */