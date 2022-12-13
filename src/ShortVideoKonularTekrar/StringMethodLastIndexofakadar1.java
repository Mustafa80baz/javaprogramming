package ShortVideoKonularTekrar;

import java.util.Scanner;

public class StringMethodLastIndexofakadar1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name="wooden spoon";//buyuk yapma
        name=name.toUpperCase();
        System.out.println("name = " + name);
        System.out.println("--------------------");

        String str="Cydeo";//kac harf var
        System.out.println(str.length());
        int say=str.length();
        System.out.println("say = " + say);
        System.out.println("--------------");
        //lastindexOf u öğrenme
        String str1="Wedenbeden";
        int sya1=str1.length()-1;
        System.out.println("harf saysı = " + sya1);
        System.out.println("--lowecase yapma");
        String str2="JAvA";
        String as=str2.toLowerCase();
        System.out.println("as = " + as);
        System.out.println("uppercse yap");
        String sa2=str2.toUpperCase();
        System.out.println("sa2 = " + sa2);
        System.out.println("----------indexof numbers------------");
        String str3="wooden Spoon";
        int leng=str3.length();
        System.out.println("leng = " + leng);
        int ilkonumarası=str3.indexOf("o");
        System.out.println("ilkonumarası = " + ilkonumarası);
        int ikinciOnumrası=str3.indexOf("od");
        System.out.println("ikinciOnumrası = " + ikinciOnumrası);
        int Sharfnumrası=str3.indexOf("S");
        System.out.println("S harfnumrası = " + Sharfnumrası);
        int lsonOharno=str3.indexOf("oon")+1;
        System.out.println("lsonOharno = " + lsonOharno);
        int sonO=str3.lastIndexOf("o");
        System.out.println("sonO = " + sonO);
        




    }
}
