package day13StringMethods;

public class IndexOfAndLastIndexOf {
    public static void main(String[] args) {
        //use for getting the index number from string

        String a="Cydeo School";
       // int da=a.indexOf("h");
        char ss=a.charAt(3);// kelimede 3 e karşılıkk gelen harfi verir "o" da e dir
        char ll=a.charAt(2);//2 ye karşılık gelen harfi verecek o da "d" dir
        System.out.println("ll = " + ll);
        System.out.println("ss = " + ss);
          // System.out.println(da);

        String ca="Java Programming language";
        int df=ca.indexOf("amm");//ilk harfi alır o da " a" nın kacıncı harf oldugunu veriri
        System.out.println("df = " + df);
        int yt=ca.indexOf("ge");// kacıncı harf oldugunu veriri
        System.out.println("yt = " + yt);
        int yu=ca.indexOf("an");
        System.out.println("yu = " + yu);
        System.out.println("-----------------------------");


                //lastindexof method// yukarının tersi yani sondan başa bakarak okur

        int yo=ca.lastIndexOf("g");
        System.out.println("yo = " + yo);
        System.out.println("----------------------------------");

        String ja="Java Nova Cava Wawa orange";

        int firsA=ja.indexOf("a");
        int lastA=ja.lastIndexOf("a");
        System.out.println("lastA = " + lastA);
        int secondA=ja.indexOf("a ");
        int thirdA=ja.indexOf("a C");

      //  int fourthA =ja.indexOf("ava W");
        //int fourthA=ja.lastIndexof("av")
        int fourthA =ja.indexOf("Ca")+1;// bu formul C nın numarasını verır +1 ekleyerek a 'nın karşılığını buluyoruz
        int po=ja.indexOf("Ca")+1;
        System.out.println("po = " + po);
        int fifthA=ja.lastIndexOf("a W");//
        int sixthA=ja.lastIndexOf("aw");
        int seventhA=ja.lastIndexOf("a ");


        System.out.println("firsA = " + firsA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);
    }

}
