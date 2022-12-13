package Day13Practise1;

import java.util.Scanner;

public class İkiAyrıKelimeninİLKVeSonHraafleri {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your first name");;
        String fulname=scan.nextLine();
        System.out.println("enter your last name");;
        String last=scan.nextLine();
        char ch1=fulname.toUpperCase().charAt(0);
        char ch2=last.toUpperCase().charAt(0);
        String sonuc=ch1+"."+ch2;
        System.out.println("sonuc = " + sonuc);


    }
}
