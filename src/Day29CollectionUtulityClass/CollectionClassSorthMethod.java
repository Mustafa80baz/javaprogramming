package Day29CollectionUtulityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionClassSorthMethod {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,5,10,4,7,9,6,8));
        Collections.sort(list);
        System.out.println("list = " + list);
    }
}
