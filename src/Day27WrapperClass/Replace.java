package Day27WrapperClass;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};//2.indexini 30 la degiştiriyoruz yani 3 terine 30 gelecek
        arr=replace(arr,2,30);
        System.out.println(Arrays.toString(arr));
        String [] arr1={"Java","Python","C++","Ruby"};
        arr1=replace(arr1,2,"C#");
        System.out.println(Arrays.toString(arr1));


    }



    //     replac the element of the array at given index with the new element
    public static int[] replace(int []array,int index,int newElement){
        if (index<0 ||index> array.length-1){
            System.err.println("invalid number");
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }
    //     replac the element of the array at given index with the new element
    public static double[] replace(double []array,int index,double newElement){
        if (index<0 ||index> array.length-1){
            System.err.println("invalid number");
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }
    //     replac the element of the array at given index with the new element
    public static char[] replace(char []array,int index,char newElement){
        if (index<0 ||index> array.length-1){
            System.err.println("invalid number");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }
    // replac the element of the array at given index with the new element
    public static String[] replace(String []array,int index,String newElement){
        if (index<0 ||index> array.length-1){
            System.err.println("invalid number");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }
}
/*
Create a method named Replace taht passes three parameters:integer array ,integer index,integer element
ex:arr={1,2,3,4,5};
replace(arr,2,30)===>{1,2,30,4,5}
2-create the same functions for double array ,char and string arrays
 */
