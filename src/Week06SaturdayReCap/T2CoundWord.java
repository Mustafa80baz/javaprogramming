package Week06SaturdayReCap;

public class T2CoundWord {
    public static void main(String[] args) {
        /*
        Task 2: Given a sentence which is string and count the words in it.
input:
  String str="Java is java in everywhere is Java";
  output:7
         */

        String str="Java is java in everywhere is java";//cümlede kac kelime var
        int counter=0;
        for (int i = 0; i <str.length() ; i++) {//if we count the spaces and adding +1 we can get the word

        if (str.charAt(i)==' '){
            counter++;
        }


        }
        System.out.println(counter+1);// kelime var cümlede
    }
}
