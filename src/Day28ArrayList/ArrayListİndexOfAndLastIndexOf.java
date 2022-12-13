package Day28ArrayList;

import java.util.ArrayList;

public class ArrayListİndexOfAndLastIndexOf {
    public static void main(String[] args) {

        //idexOf(Data)=returns the first matching element's  index number verir, o da int dir
        //LastIdexOf(Data)=returns the last matching element's index number verir, o da int dir
        ArrayList<Character>characters=new ArrayList<>();//
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        characters.indexOf('A');//indexof da numrara değil element girilir elemnetin numarasını verir
    int a=characters.indexOf('A');//0
    int b=characters.lastIndexOf('A');//4
        System.out.println("a = " + a);
        System.out.println("b = " + b);




    }



}
