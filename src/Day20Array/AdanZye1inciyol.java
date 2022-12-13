package Day20Array;

import java.util.Arrays;

public class AdanZye1inciyol {
    public static void main(String[] args) {
        char [] letters=new char[26];
        //for (int i = 0; i <letters.lenght ; i++) { i=sadece index numberları artırır

   char ch='A';
        for (int i = 0; i < letters.length; i++) {
            letters[i]=ch;
            ch++;

        }
        System.out.println(Arrays.toString(letters));
        }



        }





