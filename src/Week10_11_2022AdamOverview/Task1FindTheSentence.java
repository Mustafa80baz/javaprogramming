package Week10_11_2022AdamOverview;

public class Task1FindTheSentence {
    /*
    Task 1 : Find the word
                    String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
                    Write a method that returns : Welcome To Core Java
                     int a=Integer.parseInt("123");
     */
    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
   getSentence(str);
    }

    public static void getSentence(String str){
        for (int i = 0; i <str.length() ; i++) {
            char ch= str.charAt(i);
            if (('a'<=ch &&ch<='z') || ('A'<=ch && ch<='Z')){
             //   temp+=ch;
            }
            if (Character.isUpperCase((ch)))

            if (Character.isAlphabetic((ch))){
              //  temp+=ch;
            }


        }
    }

}
