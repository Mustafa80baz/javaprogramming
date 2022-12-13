package ZulpikarWweek5String;

public class StringMethod {
    public static void main(String[] args) {
        String str1="hat";
        String str2=new String("hat");
        boolean equal1=str1.equals(str2);
        System.out.println("ismae = " + equal1);//tru equal but
        boolean issame=str1==str2;
        System.out.println("issame = " + issame);
        String str3="hat";
        boolean isaynı=str1==str3;
        System.out.println("isaynı = " + isaynı);
        str3="bag";// yeni string olusturuluyor  çünki immutable reassingment da öyle



        //indexOf();  index numaralarını verrir
        String as="Hello, Word";
        System.out.println(as.indexOf('o'));
        System.out.println(as.lastIndexOf("or"));
String as1="This is substring practice";
        System.out.println(as1.substring(5));
        System.out.println(as1.substring(5, 10));

        System.out.println(as1.repeat(3));

        String names="PRACTSE";
        String nua="practise";
        System.out.println(names.equalsIgnoreCase(nua));
        System.out.println(names.equals(nua));;

        String word="Robert Down Junior";
        System.out.println(word.charAt(0));

        String first=word.substring(0)+"."+ word.substring(7)+". "+word.substring(12);

    }



}
