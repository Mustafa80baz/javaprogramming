package Day29CollectionUtulityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElemnt2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,2,3,3,4,5,5,6,7,7,8,9,9));//uniqleri bul

        ArrayList<Integer>unique=new ArrayList<>(list1);//önce hapsini ekledik uniqleri nuraya yeni arraya yazdırma
        unique.removeIf(p-> Collections.frequency(list1,p)>1);
                //kalanı da yenı uniqu arrayıne yazdır
        System.out.println("unique = " + unique);


    }
}
