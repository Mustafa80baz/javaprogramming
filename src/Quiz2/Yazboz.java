package Quiz2;

import java.util.Arrays;

public class Yazboz {
    public static void main(String[] args) {
        int[][]arr2D={{1,2,3,},{4,5,6,7,},{8,9,11,67,12}};
       // System.out.println(Arrays.toString(arr2D[0]));
        //System.out.println(Arrays.toString(arr2D[1]));//sadece onu yazdırır
        //System.out.println(Arrays.toString(arr2D[2]));
        for (int i = 0; i < arr2D.length ; i++) {//i:index of single dimension
           // System.out.println(Arrays.toString(arr2D[i]));
            for (int j = 0; j < arr2D[i].length; j++) {//j index of elements
                System.out.print(arr2D[i][j]+" ");

            }

            System.out.println();
        }

        }
    }

