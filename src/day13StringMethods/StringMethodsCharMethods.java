package day13StringMethods;

public class StringMethodsCharMethods {
    public static void main(String[] args) {
        String word="Cydeo";
        //minimum index number :0 max number:4 yukarısı kapsama dışına çıkar bur formulle olmaz
        char w=word.charAt(3);
        System.out.println(w);

        System.out.println("-------------------");

        String word1="Fatma";
        char son=word1.charAt(4);
        System.out.println(son);
        System.out.println("-----------------------------------");

        String ad="NİHAL";//Nihal 5 harfli ancak java saymaya 0 dan bşlıyor. Son harfi 4 oluyor onun icin
        char a=ad.charAt(2);
        System.out.println(a);
        System.out.println("-----------------------");

        String  as="Salih";
        char sa=as.charAt(2);
        System.out.println(sa);
        System.out.println("-----------------------");
        String ad1="   Numan   ";
        char numan=ad1.charAt(2);
        System.out.println("numan = " + numan);
        System.out.println("----------------------");

       int s=ad1.length();// harf sayısı bulma her zaman int le yap
        System.out.println(s);
//son harfini bulma
       int d=ad1.length()-1;
        System.out.println("d = " + d);
        int ad12=word1.length()-1;
        System.out.println(ad12);
       String ade= ad1.toLowerCase();
        System.out.println("ade = " + ade);
        String ade1=ad1.toUpperCase();
                System.out.println("ade1 = " + ade1);
                String ade3=ad1.trim();
        System.out.println("ade3 = " + ade3);
        //index number her zaman int

    }
}
