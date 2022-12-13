package Day20Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticenEnterNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //ask user how many numbers want to enter.then contain all numbers. declare in array
        System.out.println("How many number you want to enter");
        int numlenhgt= scan.nextInt();//kac kere gireceginin sayısı bu
        if (numlenhgt<=0){//giridigi sayı 0 veya eksi olamdıgından emein olacagız.Gecerli sayı olsun diye
            System.out.println("invalid number");
            System.exit(0);
        }
        int[]numbers=new int[numlenhgt];//array da depolamak için ilk olusturalacak depo alanı
        for (int i = 0; i < numlenhgt; i++) {// 10 kere sayı girmesi için for loop
            System.out.println("Enter a number");
            numbers[i]= scan.nextInt();// girilen sayılar int nubersa depolanması(arraya) için nubers yeniden atandı

        }
        System.out.println(Arrays.toString(numbers));
    }
}
