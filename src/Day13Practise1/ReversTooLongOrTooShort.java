package Day13Practise1;

import java.util.Scanner;

public class ReversTooLongOrTooShort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word= scan.nextLine();
        if (word.length()>=5){
            System.out.println("too long");

        } else {
            System.out.println("too short");




    }

    }

}
