package Day29BulkOperatoins;

import java.util.ArrayList;

public class intArrayiIntegerlistYapma {
    public static void main(String[] args) {
     int[] arr={1,2,3,4,5,6,7,8,910};
     ArrayList<Integer>list3=new ArrayList<>(convertArrayToArraylist(arr));
        System.out.println(list3);
    }
    public  static ArrayList<Integer>convertArrayToArraylist(int []array){
        ArrayList<Integer>list=new ArrayList<>();
        for (int each : array) {
            list.add(each);

        }
        return list;

    }


}
