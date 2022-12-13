package day12SwichAndScanner;

//import java.util.*;// wild import imports everything

import java.util.Scanner;// regular one means one by one


public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number 1-7");

      int num= scan.nextInt();
        String result="";
        if (num>=1 && num<=7){
            result=(num==1)?"pazartesi" :(num==2)?"salı":  (num==3)? "carsamba":(num==4)? "Perşembe":(num==5)?"cuma":(num==6)?"ctesi":"pazar";
        }else{
           result="invalid";
        }
        System.out.println(result);
        scan.close();

    }
}
