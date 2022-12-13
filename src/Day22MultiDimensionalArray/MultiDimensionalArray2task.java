package Day22MultiDimensionalArray;

public class MultiDimensionalArray2task {
    public static void main(String[] args) {
        int[][]arr2D={{1,2,3,},{4,5,6,7,8},{9,11,67,12,13}};
        /*
       out put: 8 9 11 67 12
                 4 5 6 7
                  1 2 3  böyle olsun
         */
        for (int i = arr2D.length - 1; i >= 0; i--) {//son indexten başa yazdırma formulu otomatick
           // arr2D[i]//her bir  grubu index numrasıyla yazdırı

           // System.out.println(Arrays.toString(arr2D[i]));
            for (int j = 0; j < arr2D[i].length; j++) {//j:index number of elements starting from 0 to last index
                System.out.print(arr2D[i][j]+" ");

                
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------");
        /*
yeni tesk   3 2 1
            8 7 6 5 4
            13 12 10 9 bu şekilde yazır
         */

        for (int i = 0; i < arr2D.length ; i++) {//i:index nombers start from 0
            for (int j = arr2D[i].length - 1; j >= 0; j--) {//j: indexk of elelmnt from last to 0
                System.out.print(arr2D[i][j]+" ");



            }
            System.out.println();
        }
    }
}
