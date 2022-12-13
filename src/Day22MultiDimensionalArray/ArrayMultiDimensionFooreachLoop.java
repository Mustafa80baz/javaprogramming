package Day22MultiDimensionalArray;

public class ArrayMultiDimensionFooreachLoop {
    public static void main(String[] args) {
        int[][]arr2D={{1,2,3,},{4,5,6,7,8},{9,11,67,12,13}};
        for (int []eachArray:arr2D) {
            for (int ecahelemet:eachArray ) {
                System.out.print(ecahelemet +" ");

            }
            System.out.println();
        }
    }
}
