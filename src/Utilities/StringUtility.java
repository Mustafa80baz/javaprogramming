package Utilities;

import java.util.Arrays;

public class StringUtility {
    //print each karakter of the given staring

    public static void printEachChar(String str){

        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }
    }
//revers the given string and returns the reversed string
    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {//java yı tersine cevir
            result +=str.charAt(i);

        }
        return result;//avaJ
    }
//checks if the given string palingdrome,returns boolean
   public static boolean ispalindrome(String str){
return reverse(str).equalsIgnoreCase(str);
    }

    //checks if the given string is anagram ,returns boolean= two string same karakter ise anagram
    public static boolean anagram(String str1,String str2){//"abc", "bca"
        char []ch1=str1.toCharArray();
        char []ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return  Arrays.equals(ch1,ch2);


    }

    //remove the dublication of the  given string" aaaabbbbccc=>abc
    public static String removedublication(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);//aaaabbbbccc
            if (!result.contains(" "+each)){
                result+=each;
            }


        }
return result;
    }

public static String removeDom(String st1){
        String result="";
    for (int i = 0; i <st1.length() ; i++) {
        char each=st1.charAt(i);//aaaabbbbcccdde
        if (!result.contains(""+each)){
            result+=each;
        }
    }
    return result;
}
}
