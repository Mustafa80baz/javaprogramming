package Day29BulkOperatoins;

import java.util.ArrayList;
import java.util.Arrays;

public class asList {
    public static void main(String[] args) {
        //non primiteve leri direk listeye cevirir
        String []names={"Josh","Jack","Daniel","Shay","Brenna"};//bu non primiteve typ ınt byte long gibi
      /*  //buradan ekleme cıkarma yapmak için  array list i cagır
    ArrayList<String>namelist=new ArrayList<>();
    namelist.addAll(Arrays.asList(names));
        System.out.println("namelist = " + namelist);

       */
        //diğer bir yolu
       ArrayList<String>namelist=new ArrayList<>(Arrays.asList(names));

        System.out.println("namelist = " + namelist);
        System.out.println("------------İntegerla yapma---");
       Integer[] arr={1,2,3,4,5,6,7,8,910};//primiteve oldugundan olmuyor int yerine  Integer yazarsak olur
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(arr));
   }

}
