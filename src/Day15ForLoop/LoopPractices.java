package Day15ForLoop;

public class LoopPractices {
    public static void main(String[] args) {
        //15 den 45 e kadar sayıları yazdır
        for (int i = 10; i <=56 ; i++) {
            System.out.print(" "+ i);

        }
        System.out.println();
        System.out.println("Hello");

        //sayıları geri sayım 100,99,98,97.....
        for (int i = 100; i >=60 ; i--) {// 100 den 50 ye gelince durur
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------");
        //print all the even nubers bettwen 1-55//1.yolu
        for (int i = 1; i <= 55; i++) { //bu loop içinde olmayanları tekrarlamaz yazdırmaz

if (i%2==0){
    System.out.print(i+" ");
        }
     }

        System.out.println("----------------------");
// diger bir yol 1 ila 55 arasındaki çift sayıları yazdır.ilk çift sayı2 son sayı 54
// formulu ona göre kur
        for (int i = 2; i <=54 ; i+=2) {
            System.out.print(" "+i);

        }

        }
        }



