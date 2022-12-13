package Week06SaturdayReCap;

public class UmledeKacKelimeGeciyor {
    public static void main(String[] args) {
        //syntax of while

      // for (int i = 1; i <=100; i++) {
         //  System.out.print("i = " + i);
/*
Task 1: Given a sentence which is string find word how many times repeats in it.

Hint: use substring with for loop

input:
*                                String str="Java is java in everywhere is Java";
*                                String word="Java";
output:3
 */




String j="Java is java in everywhere is java";
int say=0;
        for (int i = 0; i <=j.length()-4 ; i++) {
            String each=j.substring(i,i+4);
            if (each.equalsIgnoreCase("JAva")){
                say++;

            }

        }
        System.out.println("say = " + say);

        }



}

