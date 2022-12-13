package Day20Array;

import java.util.Arrays;

public class AdanZye2inciYol {
    public static void main(String[] args) {
        char[] letters=new char[26];
        /*
         //  for (int i = 0,j='A'; i<letters.length; i++,j++) {//j=char artırır bir yolu A dan Z ye
        //   letters[i]=(char)j;
         */
        for (char i = 'A',j=0; i >='Z' && j<letters.length ; i++,j++) {
           letters[j]=i;

        }
        System.out.println(Arrays.toString(letters));
    }
}
