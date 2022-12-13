package Day22MultiDimensionalArray;

import java.util.Arrays;

public class ItetartingMultıDimensionArray {
    public static void main(String[] args) {
        int [][] arr2D={{1 ,2 ,3},   {4 ,5 ,6 ,7},  {7, 8, 9 ,10,11} };
        //her grubu for loopla yazdıralım
        int gorup=0;
        for (int i = 0; i < arr2D.length ; i++) {//i :index of single dimensionel array
            System.out.println(Arrays.toString(arr2D[i]));;

        }

    }
}
