package day15ForAndLoopTaskcozum;

import java.util.Scanner;

public class replacementMethod {
    public static void main(String[] args) {
        //soru cözümü
        //1,Write a program that asks user to enter a word. If the word starts with x,replaceit with.


        System.out.println("Enter a word");

        String word=new Scanner(System.in).next();// bir kere kullanacaksak direk stringle yaparız
       if (word.charAt(0)=='x');{
            word=word.replaceFirst("x","a");
        //  System.out.println(word);
            System.out.println("-----------------------");
      //soru 2 Write a program that asks user to enter a word.and replaca all the x and X with charkter a inpu xcydeoX  out put acydea
            String word1=word.replace("x","a").replace("X","a");
            System.out.println(word);
            System.out.println("---------------------------------");
            String fg="yeredesiY";
          String rep=  fg.replace("y","N").replace("Y","n");
            System.out.println("rep = " + rep);




        }




    }
}
