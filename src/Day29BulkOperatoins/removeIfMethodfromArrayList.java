package Day29BulkOperatoins;

import java.util.ArrayList;
import java.util.Arrays;

public class removeIfMethodfromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("list = " + list);
        //5 den kuçuk olanları remove edecez
        list.removeIf(p-> p<5);//lambda expression
        System.out.println(list);
        System.out.println("-----------------remove even number  exam----------");
        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,910));
        list1.removeIf(p-> p%2==0);
            System.out.println("list1 = " + list1);

        System.out.println("------------remove odd number----------");

        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,78,90,45,67,56,44));
       list2.removeIf(p->p %2!=0);
        System.out.println("list2 = " + list2);
        System.out.println("--------------String örnek---------");
        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Java","Python","Javascript","C#","C++","Java","Java"));
        names.removeIf(p-> p.startsWith("J"));
        System.out.println("names = " + names);


        }



    }

