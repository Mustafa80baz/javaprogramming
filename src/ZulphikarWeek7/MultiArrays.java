package ZulphikarWeek7;

import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {
        /*
        crate a 2 dimentional array of  fruits, has fruits,price, count
        print-->apple price is 10 dolar
         */
one();
two();
    }
public static void one(){
    String [][] fruits=new String[3][];
    String [] fruit={"apple","banana","pear"};
    String [] price={"10","12","4"};
    String [] count={"100","190","200"};
    fruits [0]=fruit;
    fruits[1]=price;
    fruits [2]=count;
    System.out.println(Arrays.deepToString(fruits));
    for (int i = 0; i < 3; i++) {
        String name=fruits[0][i];
        String price1=fruits[1][i];
        String count1=fruits[2][i];

    }

}
    //get sum of these number


public static void two(){
    int[][] table = { {1,4,9},{11,4,3},{2,2,3} };
    int sum=0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            sum+=table[i][j];

        }

    }
    System.out.println(sum);

    /*
    int[][] table = { {1,4,9},{11,4,3},{2,2,3} }; Bu da bir çözüm
        int sum = 0;
        for (int[] singles : table) {

            for (int each : singles) {
                   sum += each;
       System.out.println(sum);
     */

}
}
