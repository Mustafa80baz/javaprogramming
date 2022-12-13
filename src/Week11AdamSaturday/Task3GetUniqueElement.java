package Week11AdamSaturday;

import java.util.ArrayList;

public class Task3GetUniqueElement {
    public static void main(String[] args) {
        /*
        Task 3 :
Create a method that get two arrays as a parameters then return the arraylist which has contains unique elements in it.
first array :1,2,3,4,5
second array :4,5,6
output:
1,2,3,4,5,6
         */
        int[] first={1,2,3,4,5};
        int[] second={4,5,6,7,7};

        ArrayList<Integer>result=getuniq(first,second);//size is flexible
        System.out.println(result);


    }

    public static ArrayList<Integer> getuniq(int[] first, int[] second) {
       ArrayList<Integer>result=new ArrayList<>();
       for (int i:first){
           if (!result.contains(i))
           result.add(i);
       }
      for (int i:second){
          if (!result.contains(i))

          result.add(i);
      }
      return result;
    }


}
