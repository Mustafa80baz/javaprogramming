package day13StringMethods;

public class subStringMedhot {
    public static void main(String[] args) {

        //substring (beginning index and ending index

        String word="Cydeo School";
        //           012345...
          String brand=word.substring(0,4);
        System.out.println("brand = " + brand);
        String brand2=word.substring(0,4+1);

        System.out.println("brand2 = " + brand2);
        System.out.println("-------------------------");
        String word2="Java programming Language";
        System.out.println(word2);
        String s1=word2.substring(0,word2.indexOf(" "));// sadece java yı yazdırır

        String s2=word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
        String s3=word2.substring(word2.lastIndexOf(" ")+1);


        System.out.println("s1 = " + s1);
        System.out.println(("s2 = " + s2)+1);
        System.out.println("s3 = " + s3);

        System.out.println("-----------------------------------------------");

        String wrd="Python C# Ruby";
        System.out.println("wrd = " + wrd);
        String wrd1=wrd.substring(0,wrd.indexOf(" "));

        String wrd2=wrd.substring(wrd.indexOf(" ")+1,wrd.lastIndexOf(" ")); //C#
        String wrd3=wrd.substring(wrd.lastIndexOf(" ")+1);

        System.out.println("wrd1 = " + wrd1);
        System.out.println("wrd2 = " + wrd2);
        System.out.println("wrd3 = " + wrd3);
        System.out.println("------------------------------**************");

        String qw="    bunu kendim yapmalıyım  ";
        qw=qw.trim();
        String qw1=qw.substring(0,qw.indexOf(" "));
        String qw2=qw.substring(qw.indexOf(" ")+1,qw.lastIndexOf(" "));
        String qw3=qw.substring(qw.lastIndexOf(" ")+1);
        System.out.println(qw);
        System.out.println("qw1 = " + qw1);
        System.out.println("qw2 = " + qw2);
        System.out.println("qw3 = " + qw3);
        System.out.println("---------------------------");





    }
}
