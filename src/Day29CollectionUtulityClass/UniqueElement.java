package Day29CollectionUtulityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,2,3,3,4,5,5,6,7,7,8,9,9));//uniqleri bul
        ArrayList<Integer> unique=new ArrayList<>();
        for (Integer each : list1) {
            int frequencey= Collections.frequency(list1,each);
            if (frequencey==1){
                unique.add(each);
            }

        }
        System.out.println(unique);
    }//bir yolu

}
