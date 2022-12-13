package Day29CollectionUtulityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReplaceAllmethod {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(10,10,20,30,40,50,60,10,70));
        System.out.println("list1 = " + list1);
        Collections.replaceAll(list1,10,100);
        System.out.println("list1 = " + list1);

    }
}
