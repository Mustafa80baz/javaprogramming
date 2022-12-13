package Day28ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Countries {
    public static void main(String[] args) {
        String [] countries={"Japan","Korea","Unıted States","Turkey","Unıted Kıngdom","Canada"};
        System.out.println(Arrays.toString(countries));
        //bu array bir veri bunu array list yapalım
       ArrayList<String>list=new ArrayList<>(Arrays.asList(countries));

               System.out.println( list);
               list.removeIf(p->p.length()>=10);
        System.out.println("list = " + list);
        //convert the Arraylist to Array
       countries= list.toArray(new String[0]);
        System.out.println(Arrays.toString(countries));

    }





}
/*
 //Creta a Array of String countreis
 */