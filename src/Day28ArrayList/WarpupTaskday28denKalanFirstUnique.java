package Day28ArrayList;

import java.util.ArrayList;

public class WarpupTaskday28denKalanFirstUnique {//interview question
    public static void main(String[] args) {
        //write a program that can return the first unique elements from an array
        //dont use indexof and lastindexof

        //write a program that can find the max number and min number from an array list
        ArrayList<Integer>list=new ArrayList<>();//frequency bakara bulacaz
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(23);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println("list = " + list);
        for (Integer each : list) {

            int freuquency=0;
            for (Integer element : list) {//önce bunu kur
                if (element==each){
                    freuquency++;

        }
                System.out.print("element 1= "+ element+" ");
            }

if (freuquency==1){
    System.out.println("each = " + each);
break;
}
        }


    }

}
