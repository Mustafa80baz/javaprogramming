package Day15ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        //Write a program that asks the user a number for 5 times returns the maximum number
        Scanner scan=new Scanner(System.in);
  int max=-2147483648;//integerin alacagı minumun number  budur.
        // .dolayısıyla yazılacak her sayı bundan buyuktur

        for (int i = 0; i < 5; i++) { // sırıfır dahil 5 dahil değil 5 defa tekrar edecek
            System.out.println("enter number:");
            int num=scan.nextInt();// 1 girdiğimde
            if(num>max){// girdiğim 1 max=-28388 den buyuk oldugundan if close
    // doğru alcak ve max =num olacak . 1,3,5,6,tekrar 1 girdiğimde altıdan olunca 6 buyuk
                // oldugundan denklem doğru deilse 6 yı lacak
                max=num;
                System.out.println("max num = " + num);
// burada girilen sayı bir önceki sayı ile karşılaştırılıp buyuse maxnum olarak atanıyor
// degilse  buyuk olan maxnumber olarak devam ediyor.girel buyukse artık buyuk number o
// ve sonrakı girilen onunla karşılaştırılıyor


        }

        }
    }
}
