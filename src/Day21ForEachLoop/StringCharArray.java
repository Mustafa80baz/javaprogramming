package Day21ForEachLoop;

import java.util.Arrays;

public class StringCharArray {
    public static void main(String[] args) {
      String ad="Java";
      char [] chars=ad.toCharArray();
        System.out.println(Arrays.toString(chars));
      for ( char each:chars){
          System.out.println( each);
          System.out.println("----------------------------------------------");

      }

    }

}
