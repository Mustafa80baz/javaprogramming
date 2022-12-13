package Day28ArrayList;

import java.util.ArrayList;

public class AddAllMethod {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
    numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("numbers = " + numbers);
        numbers.add(8);
        System.out.println("numbers = " + numbers);
    int a=    numbers.size();
        System.out.println("a :"+a);
   int b= numbers.get(2);
        System.out.println("b :"+b);
        numbers.remove(4);
        System.out.println(numbers);
     int c=numbers.indexOf(2);
        System.out.println("c :"+c);
        int lastindexof=numbers.lastIndexOf(4);
        System.out.println("lastindexof = " + lastindexof);
     boolean iscont=  numbers.contains(8);
        System.out.println(iscont);
        boolean bos=numbers.isEmpty();
        System.out.println("bos = " + bos);

    }
}
