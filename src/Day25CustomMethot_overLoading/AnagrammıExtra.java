package Day25CustomMethot_overLoading;

import java.util.Arrays;

public class AnagrammıExtra {
    public static void main(String[] args) {
       char []ch1={'a','b','c'};
        char []ch2={'b','c','a'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean isegual=Arrays.equals(ch1,ch2);
        System.out.println(isegual);
    }
}
