package Day28ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class isEmptyMethod {
    public static void main(String[] args) {
        //isempty method yine boolean döner
        ArrayList<Integer> list1=new ArrayList<>();//sonuc booleandır ture false olur
        list1.add(100);
        list1.add(100);
        list1.add(100);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);



        boolean r2=list1.isEmpty();//list1 de element oldugundan false verdi
                System.out.println("r2 = " + r2);//false
        list1.clear();//list1 temizler
      boolean r3=list1.isEmpty();//temizlenmiş listeyi soryoruz
        System.out.println("r3 = " + r3);//şimdi true verri
        System.out.println("------------------addAll-------------");
        ArrayList<Integer>number=new ArrayList<>();
        //bulk operation için coolection typ gerekir
       // number.addAll(1,2,3,4,5,6) bunları eklemek  için
        number.addAll(Arrays.asList(1,2,3,4,5,6));
        System.out.println(number);



    }
}
