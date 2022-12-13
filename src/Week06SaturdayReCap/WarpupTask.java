package Week06SaturdayReCap;

public class WarpupTask {
    public static void main(String[] args) {
        /*
         Given a non-empty string like "Code" print a string like below output.
 *                                 Code → "CCoCodCode"
 *                                 abc → "aababc"
 *                                 ab → "aab"
         */

        String word="codec";//birseyleri tekrar edeceksen for loop
    String temp="";
        for (int i = 0; i < word.length(); i++) {
            String each=word.substring(0,i);
            temp +=each;


        }
        System.out.println("temp = " + temp);






    }
}
