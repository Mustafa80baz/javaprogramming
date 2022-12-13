package day15StringMethoad;

public class IsBlank {
    public static void main(String[] args) {
        String a=" ";
        boolean as=a.isBlank();//true cünki içiboş
        System.out.println("as = " + as);
        System.out.println("------------------");
        String d="";
        boolean v=d.isBlank();// true yine boş 1 yada 5 fark etmez
        System.out.println("v = " + v);
        System.out.println(" ----------------------------------");

        String k="er";
        boolean y=k.isBlank();
        System.out.println("y = " + y);// false çunki er var içinde

    }
}
