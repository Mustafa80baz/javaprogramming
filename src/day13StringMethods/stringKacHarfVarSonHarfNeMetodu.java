package day13StringMethods;

import java.util.Scanner;

public class stringKacHarfVarSonHarfNeMetodu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String s1="Batch  is  the  best batch.";
              int totalChar=s1.length();//harf sayısı bulma formulu
        System.out.println("totalChar = " + totalChar);
      char ilkh=s1.charAt(3);
        System.out.println("ilkh = " + ilkh);

      //  System.out.println("------------------*********************------");
       // char lastChar=s1.charAt(s1.length()-1);// son harfi karakteri bulma formülü
        //System.out.println("lastChar = " + lastChar);// son harf yada karakter ne varsa onu bulma
        //System.out.println("---------------------------------------------");

      //  String s2="ben dertlere düçar olmuşum kimin haberi var";
        //int toplamHarf=s2.length();//kaç harf var formülü
        //System.out.println("toplamHarf = " + toplamHarf);
      //char sonHarf=s2.charAt(s2.length()-2);
        //System.out.println("sonHarf = " + sonHarf);
        System.out.println("------------------------------------------------------");
String qe="Wooden Spoon";
 int ilkO=qe.indexOf("o");
        System.out.println(ilkO);
int ikinciO=qe.indexOf("od");
        System.out.println(ikinciO);
        int eharf=qe.indexOf("e");
        System.out.println("eharf = " + eharf);
   int sonO=qe.lastIndexOf("on");
        System.out.println("sonO = " + sonO);

        System.out.println("--------------------------*************");
        String dc="Java";
        int result=dc.length();
        System.out.println("Length is: " + result);
        System.out.println("--------76888*********");

        Scanner scan1 = new Scanner(System.in);
        String word = scan1.nextLine();
        String sentence = scan1.nextLine();
        System.out.println("Enter Airpods");

        boolean containsGiven = word.contains("AirPods");
        System.out.println(containsGiven);
        boolean containsSentence = sentence.contains("AirPods");

        if (containsGiven && containsGiven==true)   {System.out.println("true");}
        if  (containsGiven && containsGiven==false) {System.out.println("true");}


       // System.out.println(containsGiven);

    }
}
