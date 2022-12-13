package Day25CustomMethot_overLoading;

import Utilities.StringUtility;

public class Test1Stringutility {

    public static void main(String[] args) {
        String str="Java Programmning Language";
        StringUtility.printEachChar(str);
        System.out.println("------------------------");

        String str1="Mustafa zab";
     String reverse=StringUtility.reverse(str1);
        System.out.println("reverse = " + reverse);
        System.out.println("-------------------");
        String word="civic";
   boolean palındrome= StringUtility.ispalindrome(word);
        System.out.println(palındrome);
        System.out.println("------------------------");
        String [] names={"Anna","Java","Python","racecar","Mom","Cydeo"};

        int count=0;
        for (String each : names) {
            if (StringUtility.ispalindrome(each)){
                count++;
            }

        }
        System.out.println(count);
        System.out.println("-----------------");
        String st1="aaaabbbcccde";
       String result=StringUtility.removeDom(st1);
        System.out.println(result);
    }




}
