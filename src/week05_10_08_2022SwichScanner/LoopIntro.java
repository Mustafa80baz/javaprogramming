package week05_10_08_2022SwichScanner;

public class LoopIntro {
    public static void main(String[] args) {
        //if we want to repeat one action more than 1 we use repeat method
        String as="1223425";
        as.charAt(0);// to get 1st char// output=1
        as.charAt(1);// to get second harf//output=2
        //index<=as.lenght(9-1)
        for (int index= 0; index < as.length();index++) {
            System.out.println(as.charAt(index));
            // 0 dan 100 kadar yazdır 1 er 1 er
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
                //0 dan 100  2 ser 2 ser
                for (int j = 0; j <=100; j+=2) {
                    System.out.println("j = " + j);
                    //100 den geriye 0 kadar
                    for (int k = 100; k >= 0; k--) {
                        System.out.println(k);

                    }


                }

            }

        }


    }
}
