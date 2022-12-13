package Day29CollectionUtulityClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        ArrayList<Integer>reverselist=new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            int each= list.get(i);
            reverselist.add(each);

        }
        System.out.println(reverselist);
            
        }
    }

