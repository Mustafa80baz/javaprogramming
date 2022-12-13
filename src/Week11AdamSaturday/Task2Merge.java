package Week11AdamSaturday;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2Merge {
    public static void main(String[] args) {

        ArrayList<Integer>number1=new ArrayList<>();
        number1.addAll(Arrays.asList(1,2,3));
                ArrayList<Integer>number2=new ArrayList<>(number1);
        number2.addAll(Arrays.asList(4,5,6));
        System.out.println("number2 = " + number2);
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        int [] end=mergeIntoArray(number1,number2);
       // System.out.println(Arrays.toString(end));


    }
    public static int []mergeIntoArray(ArrayList<Integer>number1,ArrayList<Integer>number2){

        int [] result =new int [number1.size()+number2.size()];
        int index=0;
        for (Integer each : number1) {
            result[index++]=each;
        }

        for (Integer each2 : number2) {
            result[index++]=each2;
        }
        return result;
    }

    /*

Create a method that get two arraylists as a parameters the return the array which has contains all elements in it.

input:
first arraylist :1,2,3
second arraylist :4,5,6
output:
1,2,3,4,5,6
     */



}
