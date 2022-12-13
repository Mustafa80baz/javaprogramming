package Week08_29_10_2002ArrayOwerview;

public class Task4LongetsPalindrome {
    public static void main(String[] args) {
        /*
         Task 4 :  For Each - Nested For
            Longest Palindrome
                Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
                    Ex:
                    Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
                    Output: No palindrome
         */

        String [] words={"java","longer word","civic","apple", "racecar", "mom", "anna"};
    String longestPalindrome="";
        for (String each:words) {  //we need to get the word one by one
            boolean isPalindrome=true;
            for (int i = 0; i <each.length()/2 ; i++) {
               char ch1 =each.charAt(i);
               char ch2=each.charAt(each.length()-i-1);
               if (ch1!=ch2){
                   isPalindrome=false;
                           break;
               }



            }

        }


    }
}
