package Day22MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSenteceCümleyiTersineCevirme {
    public static void main(String[] args) {//cümleyi terse cevirme
        String sentence="Today is a good day to learn Java";
        String[] word=sentence.split(" ");
  System.out.println(Arrays.toString(word));//cumleyi [] içine aldı [Today, is, a, good, day, to, learn, Java]
        String reverse="";
        for (int i = word.length-1; i >=0 ; i--) {
            reverse+=word[i]+" ";


        }

        System.out.println("reverse = " + reverse);
    }
}
