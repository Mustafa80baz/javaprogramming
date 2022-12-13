package Day28ArrayList;

import java.util.ArrayList;

public class ArrayListMethod2SetAndRemove {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();//şuan da hiç elamnı yok arraylist bos
      list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        System.out.println("list = " + list);
        list.set(2,"javacsript");//replace yapar.2.elemnt javascript oldu
        list.set(3,"C++");
        System.out.println(list);





    }
    }


