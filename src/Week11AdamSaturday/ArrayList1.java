package Week11AdamSaturday;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(1);
        System.out.println("numbers = " + numbers);
        //numbers = [1, 1, 1,2, 3, 4, 5, 1, 1] arrayList
        //          0   1  2  3  4  5  6  7  8 // index number
        System.out.println(numbers.indexOf(1));//0
        System.out.println(numbers.lastIndexOf(1));//  7

        System.out.println("-----------------------------------");
        ArrayList<Integer>numbers1=new ArrayList<>();

        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers1.add(6);
        numbers1.add(7);
        numbers1.add(1);
        numbers1.add(1);
        System.out.println("numbers1 = " + numbers1);
numbers1.remove(1);//bu index 1 nı yanı 2 yi remover
        numbers1.remove(2);//  2,3 un  index numarası ve 3  ü remove eder
        Integer b=4;//dediğimizde b yi 4 eşitleyip
        numbers1.remove(b);//dersek  4 ü remove eder..
        System.out.println("numbers1 = " + numbers1);//numbers1 = [1, 3, 5, 6, 7, 1, 1]
        numbers1.remove(new Integer(5));// 5 siler
        System.out.println("numbers1 = " + numbers1);
        System.out.println("-----------------bulk operation--------");
        //addAll
        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Mustafa","Fatma","Numan","Salih","Nihal"));
        System.out.println(names);
        numbers1.removeIf(p-> p<3);
        System.out.println("numbers1 = " + numbers1);

        //removeIf
        names.removeIf(p-> p.equals("Numan"));
        System.out.println(names);

    }
}
