package Day28ArrayList;

import java.util.ArrayList;

public class EqualsMethod {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();//sonuc booleandır ture false olur
        list1.add(100);
        list1.add(100);
        list1.add(100);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);
        System.out.println(list1==list2); // ikisi de new object oldugundan biribirne eşit bu meteodle ayapılamaz değil 2 ayrı array
        System.out.println(list1.equals(list2));//element  sayı ve deger olarak aynı olup omadığına bakar

    }
}
