package Week08_29_10_2002ArrayOwerview;

import java.util.Arrays;

public class Arrayshort {
    public static void main(String[] args) {
        int [] number={1,2,3,6,7,4,9,16,12,11,};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        System.out.println("-----------------------------");
        char [] letter={'a','e','t','b','f','b'};
        System.out.println(Arrays.toString(letter));
        Arrays.sort(letter);
        System.out.println(Arrays.toString(letter));
    }
}
