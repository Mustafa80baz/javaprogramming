package Week08_29_10_2002ArrayOwerview;

import java.util.Arrays;

public class ArrayEqualMethod {
    public static void main(String[] args) {
        int [] number={1,2,3,};
        int [] number1={1,3,2,};
        Arrays.sort(number1);
        boolean isequla=Arrays.equals(number,number1);
        System.out.println("isequla = " + isequla);
    }
}
