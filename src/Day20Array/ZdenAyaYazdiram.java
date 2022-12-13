package Day20Array;

import java.util.Arrays;

public class ZdenAyaYazdiram {
    public static void main(String[] args) {
        char[] letter=new char[26];
        char ch ='Z';
        for (int i =0; i <letter.length ; i++) {
            letter[i]=ch--;// sadece buray ch++ yaptıgında A dan Zye //char ch='Z' yapıp  ch-- yaptıgında da Z den A ya yazar
            
        }
        System.out.println(Arrays.toString(letter));
    }
}
