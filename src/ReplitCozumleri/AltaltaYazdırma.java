package ReplitCozumleri;

import java.util.Scanner;

public class AltaltaYazdırma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word= input.next();

        for (int i = 0; i <word.length(); i++) {
            char ch=word.charAt(i);
            System.out.println(ch);
        }

    }
}
