package Day28ArrayList;

import java.util.ArrayList;

public class FindMaxNumber {
    public static void main(String[] args) {

    ArrayList<Integer> list=new ArrayList<>();//frequency bakara bulacaz
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println("list = " + list);
        int max= list.get(0);
        int min= list.get(0);
        int sum=0;//arrayın içini toplama
        for (Integer each : list) {
            if (each>max){
                max=each;
            }
if (each<min){
    min=each;
}
sum+=each;
        }
        double avarage=(double) sum/ list.size();
        System.out.println("avarage = " + avarage);
        System.out.println("max = " + max);
        System.out.println("min = " + min);




}
}