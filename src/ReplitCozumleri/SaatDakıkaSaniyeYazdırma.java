package ReplitCozumleri;
import java.util.*;
public class SaatDakıkaSaniyeYazdırma {
    public static void main(String[] args) {
        /*
        ### In this task, you will need to use multiple variables and combine them together into the time of the day.
``` For example it will be something like this:
    12:24:33 PM
``1. In the beginning of the code, declare three `int` variables: `hour, minute, second` and declare a `String` variable: `amOrPm`.
> You only need to declare, no assignment.
. In the middle of the code, the variables will be assigned a value using Scanner.
> Do not touch anything in this section.
3. In the end of the code, use the variables to put together and print the time of the day using the following format:
  ``` hours:minutes:seconds amOrPm
  ```Main topics: variables, primitive datatypes, String, Scanner, concatenation
       */
       int hour;
        int minute;
        int second ;
        String amOrPm;

        //DO NOT TOUCH BELOW LINES.
        Scanner sc = new Scanner(System.in);
        hour   = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.next();
        //#############################

        //2. WRITE YOUR CODE HERE:
        // hours:minutes:seconds amOrPm
        System.out.println(hour+":"+minute+":"+second+" "+ amOrPm);



    }
}
