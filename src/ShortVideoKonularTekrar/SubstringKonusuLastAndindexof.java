package ShortVideoKonularTekrar;

public class SubstringKonusuLastAndindexof {
    public static void main(String[] args) {
       //cumleden parcalar almak için kullanılabilir başlangıcını belirtecegiz
       //harf numarasını bilmiyorsak indexof metodu ile harfi yaz oradan balasın
       String str="Java Programming language";//programminden balayıp sponuna kadar cumleden ayıralım
        //bunu substring atrı indexofl ayapacaz
        String jv=str.substring(str.indexOf("J"));
        System.out.println(jv);
     String fg = str.substring(str.indexOf("P"));
        System.out.println(fg);
        String ch=str.substring(str.indexOf("l"));
        System.out.println(ch);
        System.out.println("------Beginin and ending----");
        //1. yolu
            //String str="Java Programming language"
        String bh=str.substring(5,16);//ending indexi saymaz onun için ya bir fazla yaz yada 1 ekle programming
        System.out.println("bh = " + bh);
String df=str.substring(17,25);
        System.out.println(df);
        String ty=str.substring(0,4);
        System.out.println("ty = " + ty);
        //2.yolu harleri saymadan indexof metoduyla
        String result=str.substring(str.indexOf("P"),str.lastIndexOf(" "));
        System.out.println("result = " + result);
        String result1=str.substring(str.indexOf("J"),str.lastIndexOf(" "));
        System.out.println("result1 = " + result1);
        String result2=str.substring(str.indexOf("ram"),str.indexOf("mi"));
        System.out.println("result2 = " + result2);
        System.out.println("----------------------------");
        String str1="I Love Java";
        String l=str1.substring(str1.indexOf("L"),str1.lastIndexOf("e")+1);
        System.out.println("l = " + l);

        String ll=str1.substring(2,5+1);
        System.out.println("ll = " + ll);
    }
}
