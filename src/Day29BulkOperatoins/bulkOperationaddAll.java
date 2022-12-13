package Day29BulkOperatoins;

import java.util.ArrayList;
import java.util.Arrays;

public class bulkOperationaddAll {
    public static void main(String[] args) {
        //bulk operatoın collectıon type da yapılır
        //
        ArrayList<Integer>list=new ArrayList<>();
        //array liste birden fazla element ekleme,
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,67,10));
        System.out.println("list = " + list);
    }

}
