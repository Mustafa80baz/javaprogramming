package Day27WrapperClass;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int [] arra3={10,10,20,30,40,30,30,30};
        System.out.println(Arrays.toString(arra3));
        arra3=replaceAll(arra3,30,300);
        System.out.println(Arrays.toString(arra3));
        replaceAll(arra3,20,200);
        System.out.println(Arrays.toString(arra3));
    }
    //Replace all element index element with the given element

    public static int[] replaceAll(int [] array,int oldValue,int newValue){

        for (int j = 0; j < array.length; j++) {
            if (array[j]==oldValue){
                array[j]=newValue;
            }

        }
     return array;



    }
    public static double[] replaceAll(double [] array,double oldValue,double newValue){

        for (int j = 0; j < array.length; j++) {
            if (array[j]==oldValue){
                array[j]=newValue;
            }

        }
        return array;

    }
    public static char[] replaceAll(char [] array,char oldValue,char newValue){

        for (int j = 0; j < array.length; j++) {
            if (array[j]==oldValue){
                array[j]=newValue;
            }

        }
        return array;

    }

    public static String[] replaceAll(String [] array,String oldValue,String newValue){

        for (int j = 0; j < array.length; j++) {
            if (array[j].equals(oldValue)){
                array[j]=newValue;
            }

        }
        return array;

    }

    }
