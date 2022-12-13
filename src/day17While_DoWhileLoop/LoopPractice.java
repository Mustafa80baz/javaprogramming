package day17While_DoWhileLoop;

public class LoopPractice {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {//eger kac kere tekrar edeceğini biliyorsan for loo kullanmalısın
            System.out.println("i = " + i);//1 den 10 kadar yazdırdırır
            System.out.println("-------------------");
            int j =1;
            while (j<=10){
                System.out.println(j);
                j++;// 2 den başlar
            }
            System.out.println("------------------------");

// do loop
            int k=1;
                    do{
                        System.out.println(k);
                        k++;
                    }while (k<=10);
        }
        //if the repetion is not known best way is while loop
        //do while denklem yanlış yada doğru bakmadan önce bir yazdırır sonra bakar
    }
}
