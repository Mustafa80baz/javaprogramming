package Day29BulkOperatoins;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllMethodAndRetainAll {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        //array liste birden fazla element ekleme,
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8,8,8,67,10));
        System.out.println("list = " + list);
        list.removeAll(Arrays.asList(3,5,7,8));//liste halinde siler// birden fazla olan rakamın tamamını siler
        System.out.println("list = " + list);
        System.out.println("----------retail");
        ArrayList<Integer>number=new ArrayList<>();
        number.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        number.retainAll(Arrays.asList(100,200,300));//buradakilerin dışında kalan butun rakalmarı listeden siler
        System.out.println("number = " + number);
        ArrayList<String>jobTitle=new ArrayList<>();
        jobTitle.addAll(Arrays.asList("QA","SDET","Develepor","QA","SDET","Scrum Master","BA","BA"));
        jobTitle.retainAll(Arrays.asList("QA","BA","SDET"));
        System.out.println("jobTitle = " + jobTitle);

    }
}
