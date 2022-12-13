package Day21ArrayMetods;

import java.util.Arrays;

public class ArrayShortChar {
    public static void main(String[] args) {
        char[] ch1={'a','b','c'};
        char[]ch2={'b','a','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean tr=Arrays.equals(ch1,ch2);
        System.out.println(tr);

    }
}
