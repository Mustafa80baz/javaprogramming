package Day28ArrayList;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {
        //contains method returns boolean
        ArrayList<Character> characters=new ArrayList<>();//
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        boolean r1=characters.contains('A');
        System.out.println("r1 = " + r1);
        boolean r2=characters.contains('Z');
        System.out.println("r2 = " + r2);

    }
}
