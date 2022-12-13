package Day26ArrayandStringUtility;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement2way {
    public static void main(String[] args) {
        int[] number={100,200,300,400,500,600};
        int []remove=removeElement(number,2);
        System.out.println(Arrays.toString(remove));

    }
//removers the element from array
   public static int[] removeElement(int[] array,int index){

       if (index<0 ||index> array.length-1){
           System.err.println("invalid index");
           System.exit(0);
       }
        int []result={};

       for (int i = 0; i < array.length ; i++) {
           if (i!=index){
               result= ArraysUtility.addelement(result,array[i]);

           }

       }
       return result;
   }

    }

