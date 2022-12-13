package Day20Array;

import java.util.Arrays;

public class AlphabetArray {
    public static void main(String[] args) {
        char[] alphabets=new char[26];
       // alphabets[0]='Z';//indexnuberı cagırma
        char ch='A';
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i]=ch;
            ch++;

        }
        System.out.println(Arrays.toString(alphabets));
    }
}
