package Week08_29_10_2002ArrayOwerview;

public class Task3Countword  {
    public static void main(String[] args) {
        /*
        Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter
                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"
                Output : 4
         */

        String []names={"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};
        int count=0;
        for (String each:names  ) {
         String ch1=each.charAt(0)+"";
            String ch2=each.charAt(each.length()-1)+"";

        }

    }
}
