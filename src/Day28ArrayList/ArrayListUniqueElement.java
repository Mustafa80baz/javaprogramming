package Day28ArrayList;

import java.util.ArrayList;

public class ArrayListUniqueElement {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();//uniqueleri yazdıracaz
        list.add("Java");//0
        list.add("Java");//1
        list.add("Java");//2
        list.add("Python");//3
        list.add("C#");//4
        list.add("C#");//5
        list.add("Ruby");//6
        list.add("C++");//7
        list.add("C++");//8
        System.out.println("list = " + list);
        ArrayList<String>unique=new ArrayList<>();
        for (String each : list) {//unique yazdırma
            if (list.indexOf(each)== list.lastIndexOf(each)){//ilk ve son kez görüngüünde sayı aynı ise aynı bir kere göründü ise
unique.add(each);
            }

        }
        System.out.println(unique);
    }
}
