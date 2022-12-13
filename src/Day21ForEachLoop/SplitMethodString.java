package Day21ForEachLoop;

import java.util.Arrays;

public class SplitMethodString {
    public static void main(String[] args) {
        String word="Wooden Spoon";
        String []a=word.split(" ");
        System.out.println(Arrays.toString(a));
        System.out.println("----------------------");
        String email="WoodenSpoon@cydeo.com";
        String []nm=email.split("@");
        System.out.println(Arrays.toString(nm));
        System.out.println("-----------------------------------------");
        String t="Today is nice day.Today is Monday.Toda we learn Java";
        String[]k= t.split("\\.");
        System.out.println(Arrays.toString(k));
    }
}
