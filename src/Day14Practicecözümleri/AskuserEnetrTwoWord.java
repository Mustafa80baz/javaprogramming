package Day14Practicecözümleri;

import java.util.Scanner;

public class AskuserEnetrTwoWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String word1= scan.next();
        System.out.println("enter secod word");
        String word2= scan.next();
        char son=word1.charAt(word1.length()-1);
        char ilk=word2.charAt(0);
        if (son==ilk){
            System.out.print(word1+word2);

        }


    }
}
