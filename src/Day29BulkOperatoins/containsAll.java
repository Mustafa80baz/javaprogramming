package Day29BulkOperatoins;

import java.util.ArrayList;
import java.util.Arrays;

public class containsAll {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
      //önce cotains tapacaz
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8,8,8,67,10));
        boolean r1=list.contains(10);
        System.out.println("r1 = " + r1);
        boolean r2=list.contains(2) &&list.contains(8)&& list.contains(10);//coklu yapma yolu  1
        System.out.println("r2 = " + r2);
    boolean r4= list.containsAll(Arrays.asList(2,4,7));
        System.out.println("r4 = " + r4);

    }
}
