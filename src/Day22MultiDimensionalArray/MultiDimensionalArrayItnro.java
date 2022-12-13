package Day22MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayItnro {
    public static void main(String[] args) {
        int [][] numbers=new int[3][];
        int [] num1={1,2,3,4};
        int [] num2={5,6,7,8};
        int [] num3={9,10,11,34};
        numbers[0]=num1;
        numbers[1]=num2;
        numbers[2]=num3;
        System.out.println(Arrays.deepToString(numbers));//[[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 34]]
 //indexof element       012           0 1   2 3     0 1 2 3  4
        int [][] arr2D={{1 ,2 ,3},   {4 ,5 ,6 ,7},  {7, 8, 9 ,10,11} };//her aaray kendi index numaber var
  // index number           0              1              2
      //[] 1.brekerts index of array yi  altakini temsil eder  ,,[] 2. brekets üsteki numraları temsil eder
        System.out.println(Arrays.toString(arr2D[1]));
//10 yazdırmakiçin
        System.out.println(Arrays.toString(arr2D[2]));//bunun içindeki bir rakamı yazdırmak için
        //10 yazdırmakiçin
        System.out.println(arr2D[2][3]);


}
    }

