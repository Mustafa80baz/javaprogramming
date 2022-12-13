package Day21ForEachLoopPractice;

import java.util.Arrays;

public class MergeTwoArraysBirleştir {
    public static void main(String[] args) {
        String [] group1= {"Ali","Layan","Aysenur"};
       String [] group2={"Maria","Aygun","Duygu","Suat","Valeriy"};

        String []students=new String[group1.length+ group2.length];

        int i=0;
        for (String each : group1) {//group 1
            students[i++]=each;
        }

        for (String each : group2) {//group2
            students[i++]=each;

        }
        System.out.println(Arrays.toString(students));
    }
}
