package Day22MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {// cümlenin ikinci kelimesini tersine cevir// interview sorusu
    public static void main(String[] args) {
        String sentence="I love Java";
        String [] word=sentence.split(" ");
        System.out.println(Arrays.toString(word));
        String reverse="";
        for (int i = word[1].length()-1; i >=0 ; i--) {
            reverse+=word[1].charAt(i);

        }
        System.out.println( reverse);
  //  sentence=sentence.replaceFirst(word[1],reverse );//1, yolu ters  halini yendien cumleye komak için.
       // word[1]=reverse;//
        //System.out.println(Arrays.toString(word));//[I, evol, Java]
       // word[1]="Love";//dogru hailene getirme
       // System.out.println(Arrays.toString(word));//[I, Love, Java]
        //for (String each:word) {// ikinci hali
         //   System.out.print(each+" ");

        }
    }

