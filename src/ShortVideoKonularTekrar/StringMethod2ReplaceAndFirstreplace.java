package ShortVideoKonularTekrar;

public class StringMethod2ReplaceAndFirstreplace {
    public static void main(String[] args) {
        String str ="Wooden Spoon";
      String rep = str.replace("o","a");
        System.out.println("rep = " + rep);
        System.out.println("--ikinci örnek--------");
        String cumle="Java I loveyou Java olamsen java";
        System.out.println(cumle);
        String cumle1=cumle.replace("Java","tava");
        System.out.println("cumle1 = " + cumle1);
        System.out.println("------------replacefirt metod--------");
        //sace ilk uyan harfi değiştitr
        String str1="Wooden Spoon";
       str1=str1.replaceFirst("e","a");//ilk hafı değiştitrr
        System.out.println(str1);
        String str1b=str1.replaceFirst("o","u");
        System.out.println("str1b = " + str1b);
        //ilk uyan kelimeyi de yapabilir
        System.out.println("----kelimeyi degiştir-----");
        String kelime=str1.replaceFirst("Spoon","kaşık");
        System.out.println("kelime = " + kelime);
    }
}
