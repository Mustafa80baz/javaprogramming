package day15ForAndLoopTaskcozum;

import java.util.Scanner;

public class emailTask {
    public static void main(String[] args) {
        //Assume that email  address is constructed by person's first name and followed
        // by an underscore and last name
        Scanner scan=new Scanner(System.in);
        String email="mike_tyson@gmail.com";
        //bir cümlede bir kelimeyi nasıl alırız? burada maildeki ilk ismi alacaz

        String firstname=email.substring(0,email.indexOf("_"));// sadece ilk adını Mike ı alır
        System.out.println("firstname = " + firstname);
        String fir=email.substring(email.indexOf("t"),email.indexOf("@")); //sadece tyson alır
        System.out.println("Last Name = " + fir);
                String rest=email.substring(email.indexOf("@"));
        System.out.println(rest);
        String emaill=firstname+"_"+fir+rest;
        System.out.println("emaill = " + emaill);












    }
}
