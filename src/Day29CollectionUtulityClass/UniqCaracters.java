package Day29CollectionUtulityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqCaracters {
    public static void main(String[] args) {
        String str="aaabccdnnfhiiiijjkkkkkkkk";//uniqu bul
        //how can l get Arraylist form the string(/how can create non primiteve array from the string ..Split kullan
      String[] arr= str.split("");//array oldu
        System.out.println("str = " + str);
        ArrayList<String>list=new ArrayList<>(Arrays.asList(arr));//arraylist yaptık
        System.out.println("list = " + list);
        String unique="";
        for (String each : list) {
          int say=Collections.frequency(list,each);
          if (say==1){
              unique+=each;
          }

        }
        System.out.println("unique = " + unique);
    }
}
