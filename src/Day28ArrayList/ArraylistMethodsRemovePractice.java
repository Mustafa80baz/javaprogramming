package Day28ArrayList;

import java.util.ArrayList;

public class ArraylistMethodsRemovePractice {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println("list = " + list);
        //remove bir  yolu
        int num=1;
        list.remove(1);
        System.out.println(list);
        //başka  1 yolu
        Integer num1=200;
        System.out.println(list);
      //diğer yolu
        list.remove(1);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

Integer num2=200;
boolean r=list.remove(num2);
        System.out.println("list = " + list);
        System.out.println("r = " + r);

        System.out.println("------------CLEAR method--------");
        //araylisten herseyi temizler
        System.out.println(list.size());//2
        list.clear();;//herseyi temizler
        System.out.println(list.size());//0
        System.out.println(list);//[] boş array

    }

}
