package Day29CollectionUtulityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Findfruquency {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(10,10,20,20,20,30,40,50,60,70,20));
        int fr= Collections.frequency(list1,20);
        System.out.println("fr = " + fr);
        System.out.println("------Strinlr frequency---------");
        ArrayList<String> words=new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Python","Python","Ruby","C#","Java"));
        int freq=Collections.frequency(words,"Java");
        System.out.println("freq Java= " + freq);
        int frequ=Collections.frequency(words,"Python");
        System.out.println("frequ Python = " + frequ);

    }
}
