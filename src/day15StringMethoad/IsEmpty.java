package day15StringMethoad;

public class IsEmpty {
    public static void main(String[] args) {
     String f="";// arada hiç boşluk bile yok
     boolean m=f.isEmpty();//ture
        System.out.println(m);
        String a="f";//f harfinden dolayı
        boolean d=a.isEmpty();// false
        System.out.println(d);
        System.out.println("--------------------");
        String n=" ";
        boolean g=n.isEmpty();
        System.out.println("g = " + g);// false çünkı boşluk ta bir karakterdir



    }
}
