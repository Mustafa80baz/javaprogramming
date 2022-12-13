package Day13Practise1;

import java.util.Scanner;

public class IsStringEmptyOrMorethan3charOrLessThan3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);//5harten buyukse son 3 nu yazdır
        System.out.println("Enter a String");
        String word= scan.nextLine();
        scan.close();
        String result="";
        int len=word.length();
                if (len==0){
                    System.out.println("empty");
                } else if (len>5) {
                    System.out.println(""+word.charAt(len-3)+word.charAt(len-2)+word.charAt(len-1));

                }else {
                    System.out.println(word);
                }

    }
}
