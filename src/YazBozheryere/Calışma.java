package YazBozheryere;

import java.util.ArrayList;
import java.util.Arrays;

public class Calışma {
    public static void main(String[] args) {

        ArrayList<String>words=new ArrayList<>(Arrays.asList("during","storm","rain","fell","seaon","cloduy","safe"));
        ArrayList<Integer>lengh=new ArrayList<>();
        for (String word:words) {
            lengh.add(word.length());

        }
        System.out.println(lengh);


    }

}






