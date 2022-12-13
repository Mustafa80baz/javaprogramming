package week05_10_08_2022SwichScanner;

import java.util.Scanner;

public class twoUppercase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //

        String word="Hello";
     String word1=""+word.charAt(0)+word.charAt(1);
        System.out.println(word1.toUpperCase());
        String word3=""+word.charAt(2)+word.charAt(3);
        System.out.println(word3.toUpperCase());
        System.out.println(word3);
/*Task 2: Create a logic print a new string made of 3 copies of the last 2 chars of the original string.

      Hint: The string length will be at least 2

 */
        System.out.println("--------------------------");
        String wer="mustafa";
    int uzun=wer.length();
        System.out.println(uzun);

        String wer1= ""+wer.toUpperCase().charAt(5)+wer.toUpperCase().charAt(6);
        System.out.println(wer1);



       String inout=scan.next();
        int a=inout.length()-1;
        int b=inout.length()-2;
        String word4=""+inout.charAt(b)+inout.charAt(a);
        System.out.println(word4.toUpperCase());



    }
}
