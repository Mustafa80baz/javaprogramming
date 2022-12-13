package day16ForAndLoop;

public class Palindrome {
    public static void main(String[] args) {
        //java ==> avaJ==> false means not palindrome
        //Anna ==> annA ==> true  Palindrpme
        String word="cydeooedyc";
        String reversed="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversed +=word.charAt(i);
         // buraya kadar reverse formulu  burdan sonra bu palindrpme mı değil mi
         //  cevabı true   false oldugundan bollean kullanılyoruz
        }

        boolean Ispalindrome=word.equalsIgnoreCase(reversed);//7 buyuk çukuk te duyarlı olma dedik
       System.out.println("Ispalindrome = " + Ispalindrome);
        System.out.println(" ---------------------------------");

        String gh="Ey edip pide ye";
        String reversed1="";
    }
}
