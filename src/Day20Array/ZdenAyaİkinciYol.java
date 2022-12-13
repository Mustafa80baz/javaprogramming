package Day20Array;

import java.util.Arrays;

public class ZdenAyaİkinciYol {
    public static void main(String[] args) {
        char []letter=new char[26];
char ch='Z';
        for( char i = 0,j='Z'; i <letter.length; i++,j--){//j harleri temsil ediyor
    letter[i]=j;

        }
        System.out.println(Arrays.toString(letter));
    }
}
