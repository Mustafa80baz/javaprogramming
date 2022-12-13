package Week10_11_2022AdamOverview;

import java.util.Arrays;

public class task2String {
    public static void main(String[] args) {
        /*
        Adam B — bugün saat 22:24
Task 3 : String numbers to sum
       Given an Array of numbers in String format, add each digit of each element and store into a different Array.
             Ex
           Input:
                    “123”, “34”, “513”
                    Output:
                    [ 6, 7, 9 ]
         */
        //first  i need to get each string. 2-s get to each digit  3-use parse metod

        String[] array={"123", "134", "513"};
        int[] result=new int [array.length];
        for (String each : array) {
          //  System.out.println(each);
            // need to get each digit
            String []eachDigit=each.split(" ");
            System.out.println(Arrays.toString(eachDigit));
            int total=0;
            for (String each1 : eachDigit) {
                int i=Integer.parseInt(each1);
                total+=i;


            }

            System.out.println(Arrays.toString(eachDigit));
            System.out.println(total);
        }
    }
}

