package Day28ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeEmployee {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();

        names.addAll(Arrays.asList("Ali","David","Ahmet","Jimmy","Daniel","Aaron","Ahmet","David","Shay"));
        names.retainAll(Arrays.asList("Ahmet","David"));
        System.out.println("names = " + names);
    }
}
