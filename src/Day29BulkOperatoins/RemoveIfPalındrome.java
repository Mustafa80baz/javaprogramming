package Day29BulkOperatoins;

import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfPalındrome {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Java","Python","Cydeo"));
     names.removeIf(a-> StringUtility.ispalindrome(a));//palindrameları sildi  basına  ! koyarsak ta palındromela gider
        System.out.println(names);

    }
}
