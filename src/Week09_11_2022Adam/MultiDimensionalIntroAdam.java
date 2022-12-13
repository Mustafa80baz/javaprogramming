package Week09_11_2022Adam;

public class MultiDimensionalIntroAdam {
    public static void main(String[] args) {
        int [] firstArray={1,2,3};//eger kac elementimiz var biliyorsak dirak böyler yaz
        int [] secondArray={4,5,6};
        int [] thirddArray={7,8,9,10};
        //int []secondArray=new int[2];// ne oldugunu bilmiyrtouz içeriğin

        int [][] twoDimension={
                {1,2,3},
        {4,5,6},
        {7,8,9,10},
        };
        //                             0      1          2
        //int [][] twoDimensionArray={{1,2,3},{4,5,6},  {7,8,9,10}};
        int [][]arra2D={firstArray,secondArray,thirddArray};
        System.out.println(twoDimension[0][1]);//1. grubun ikinci elemtini yazdırdık önemli
        System.out.println(twoDimension[2][3]);//2.grubun 3 elementini yazdırma

        for (int i = 0; i < twoDimension.length ; i++) {//her gurbu tek tke gider
            System.out.println(i+1+". array");
            for (int j = 0; j < twoDimension[i].length ; j++) {//her grubun içine tek tek gider
                System.out.println(twoDimension[i][j]);

            }

        }
    }

}
