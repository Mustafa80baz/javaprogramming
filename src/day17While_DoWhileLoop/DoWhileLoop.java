package day17While_DoWhileLoop;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean a=false;
        while (a) {//pareantez içinde yazılan doğru değilse println calışmaz
            System.out.println("wooden Spoon");// bunu a false olduğundan yazdırmaz

            System.out.println("----------------");
            do {//en az bir kere yazdırır.önce yazdırır.sonra while kontrol eder
                // yanlışsa bir daha yazdırmaz
                System.out.println("Wooden Spoon");

            }while (a);
            {
                System.out.println("wooden spoon");
            }

        }
    }
}
