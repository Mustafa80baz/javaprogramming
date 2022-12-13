package Day13Practise1;

import java.util.Scanner;

public class CumleninilkVeSonHrfiniYazdırma {
    public static void main(String[] args) {//cumlenin ilk ve son karakterini yazdırma
        Scanner scan=new Scanner(System.in);
        System.out.println("entere a sentence");

        String cumle=scan.nextLine();
        char ilk=cumle.charAt(0);
        System.out.println("ilk = " + ilk);
        char son= cumle.charAt(cumle.length()-1);
        System.out.println("son = " + son);
        String sonuc=ilk+"."+son;
        System.out.println("sonuc = " + sonuc);

    





    }
}
