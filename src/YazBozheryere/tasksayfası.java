package YazBozheryere;

import java.util.ArrayList;
import java.util.Arrays;

public class tasksayfası {
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();
        number.addAll(Arrays.asList(1,2,3,4,5,8));
        System.out.println("number = " + number);
        int max=0;
        int min=0;
        int sum=0;
        double avarage=0;

        for (Integer each : number) {
            if (each>max){
               max=each;
            }
        if (each<min){
            min=each;
        }
        sum+=each;
        double avaraege=sum/ number.size();
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);
        System.out.println("avarage = " + avarage);
    }
}
