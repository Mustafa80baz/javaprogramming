package week05_10_08_2022SwichScanner;

public class EncrpytSoruxcxy {
    public static void main(String[] args) {
        /*
        Task 9: Given a string password. Encrypt with "x" a given password and print.

    Hint: do with for loop

     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
         */
        String pasword="Cydeo";
        char encrptwith='X';    //bir char  bir x bir cahr bir x
        String encrptPassword="";
        for (int i = 0; i < pasword.length(); i++) {
            encrptPassword+=""+pasword.charAt(i)+encrptwith;
        }
        System.out.println(encrptPassword);


    }
}
