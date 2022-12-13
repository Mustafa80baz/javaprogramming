package Day13Practise1;

import java.util.Scanner;

public class MiddleWordCool {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 3  letter ");
        String word= scan.next();
        int leng=word.length();
        if (leng==3){
            if (word.charAt(1)=='a'){
                System.out.println("cool word");
            } else if (word.charAt(1)!='a') {
                System.out.println("Okay word");
            }
        } else {
                if (leng<3){
                    System.out.println("word is too short");
                }else {
                    System.out.println("word is too long");
                }
            }




    }
}
