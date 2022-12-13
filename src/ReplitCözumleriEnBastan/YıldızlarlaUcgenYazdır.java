package ReplitCözumleriEnBastan;

public class YıldızlarlaUcgenYazdır {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            for (int j = 0; j <10 ; j++) {
                if(i==9&&j==9){
                    System.out.print("A");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();

        }
    }
}
