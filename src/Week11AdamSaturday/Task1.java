package Week11AdamSaturday;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        /*

Create a method that which is get array list as a parameter then return the numbers which are divisible by 3.
input:
    numbers : 2,3,4,5,6,8,9
    3,6,9
         */

        ArrayList<Integer>number=new ArrayList<>();
        number.addAll(Arrays.asList(2,3,4,5,6,8,9));
        ArrayList<Integer>number1=new ArrayList<>();
        System.out.println("number = " + number);
        number.removeIf(p->!(p%3==0));
        System.out.println("number = " + number);

    }
}
