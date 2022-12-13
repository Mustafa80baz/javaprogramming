package Day29CollectionUtulityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RevrseArraylistIncollection {
    public static void main(String[] args) {
        ArrayList<Character>list=new ArrayList<>();
        list.addAll(Arrays.asList('A','B','C','D','E'));
        System.out.println("list = " + list);
        Collections.reverse(list);
        System.out.println("list = " + list);

    }
}
