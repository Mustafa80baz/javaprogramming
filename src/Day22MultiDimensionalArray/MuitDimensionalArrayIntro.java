package Day22MultiDimensionalArray;

import java.util.Arrays;

public class MuitDimensionalArrayIntro {
    public static void main(String[] args) {

String[] group1={"Ali","Murat","Mustafa"};
String[] group2={"Ayse","Melek","Hatice"};
String[] group3={"Mehmet","Emine","Fatma"};

String[][] groups=new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;
        System.out.println(Arrays.deepToString(groups));


    }
}
