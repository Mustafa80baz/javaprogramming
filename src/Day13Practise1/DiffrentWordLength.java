package Day13Practise1;

import java.util.Scanner;

public class DiffrentWordLength {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter  a word");
        String word1= scan.nextLine();
        int length1 =word1.length();
        System.out.println("Enter second word");
        String word2= scan.nextLine();
        int lenght2=word2.length();
        System.out.println("enter 3rd word");
        String word3 = scan.nextLine();
        int length3=word3.length();

        if (length1==lenght2 && length1==length3 &&lenght2==length3){
            System.out.println("All words are same");
        }
        if (length1==lenght2 && length1!=length3 ||length1==length3 &&length1!=lenght2){
            System.out.println("not Same or Diffrent length");
        }
        if (length1!=length3&&length1!=lenght2 && lenght2!=length3){
            System.out.println("All different length");
        }

    }
}
