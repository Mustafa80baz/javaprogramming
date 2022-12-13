package day13StringMethods;

public class Subtring {
    public static void main(String[] args) {
        String a="Java is the programming laguage";
        String b=a.substring(a.indexOf("p"));
        System.out.println("b = " + b);
        String c=a.substring(a.lastIndexOf("l"));
        System.out.println("c = " + c);
        int d=a.length();
        System.out.println("d = " + d);
        String s=a.substring(a.indexOf("i"),a.lastIndexOf("p")-1);
        System.out.println("s = " + s);
    }
}
