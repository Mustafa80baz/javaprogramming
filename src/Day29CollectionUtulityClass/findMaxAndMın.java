package Day29CollectionUtulityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class findMaxAndMın {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60,70));
        System.out.println("list1 = " + list1);
        int max= Collections.max(list1);
        System.out.println("max = " + max);
        int min=Collections.min(list1);
        System.out.println("min = " + min);

    }
}
