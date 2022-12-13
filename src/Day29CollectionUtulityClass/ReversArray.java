package Day29CollectionUtulityClass;

import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};  // reverse yapıp {6,5,4,3,2,1} bunu elde edeceğiz
        //önce tersden sıralandıgında yazılacak teri hazırla
        int [] result=new int[array.length];//yeterli ter actıgından emin olmak için array.lengt alınır
        int j=0; // J int resultın ındex numberını temsil eder ve diğeri düserken bu aratar.Buraya yazıldıgı ıçin,
        for (int i = array.length - 1; i >= 0; i--,j++) {
            //i =ilk arrayın elementlerini j ise yeni arrayın (result)elemnterini tems
            result[j]=array[i];
        }
        System.out.println(Arrays.toString(result));
    }

}
