package ShortVideoKonularTekrar;

public class equalsMeyhodIgnoreequals {
    public static void main(String[] args) {
        String srt="Java";
        String str2=new String("Java");
        //bunlar eşit mi
        boolean Isesit=(srt==str2);
        System.out.println("Isesit = " + Isesit);
        System.out.println(srt.equals(str2));//aynı yazı mı ancak buyuk kucuk duyarlılıgı var
        System.out.println("----ıgnore equals method---------------");
        String word1="JAVA";
        String word2="java";
        boolean esitmı=(word2==word1);//aynı gibi olsa da 2 ayrı obje bu nedenle false
        System.out.println("esitmı = " + esitmı);
        boolean esıtmı2=word1.equals(word2);//false buyuk kuuck harf farkı var
        System.out.println("esıtmı2 = " + esıtmı2);
        boolean buesitmi=(word1.equalsIgnoreCase(word2));//işte bu eşit yanni true
        System.out.println("buesitmi = " + buesitmi);
    }
}
