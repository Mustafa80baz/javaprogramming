package ZulphikarWeek6loopFor;

import java.util.Arrays;

public class twoDimentionalArray {
    public static void main(String[] args) {
        //arraylare nasıl element eklenir
        int [] a=new int[5];
        int [][] b=new int[5][];
        int [][][]c=new int[5][][];
        
        //ekleme yolları
        a[0]=2;
        b [0]=new int[]{2,3,4,5};   
        
        //2.yolu
        int [] element={1,3,2};
        b[1]=element;

        System.out.println("Arrays.deepToString(b) = " + Arrays.deepToString(b));
        //index no    0        1       2
                 //[1,2,3],[4,5,6,],[5,6,7]
    // element no  0 1  2   0 1 2    0 1  2
    }
}
