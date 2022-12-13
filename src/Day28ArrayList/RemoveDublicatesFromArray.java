package Day28ArrayList;

import java.util.ArrayList;

public class RemoveDublicatesFromArray {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(20);
        list.add(70);
        list.add(20);
        list.add(60);
        list.add(60);
        list.add(70);

        System.out.println("list = " + list);

        ArrayList<Integer>resul=new ArrayList<>();//10,20,30
        for (Integer each :list) {
            if (resul.contains(each)){
                continue;
            }
            resul.add(each);
        }
        System.out.println("resul = " + resul);
     int a=list.get(1);
        System.out.println("a = " + a);
    }
}
