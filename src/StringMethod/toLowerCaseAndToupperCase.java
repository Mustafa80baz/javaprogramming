package StringMethod;

public class toLowerCaseAndToupperCase {
    public static void main(String[] args) {
        String str="JAVA";
        System.out.println("str = " + str);
       str= str.toLowerCase();//yeniden yazıyor hepsini küçüklle yazacak

        System.out.println("str = " + str);
        String q="java";
        q=q.toUpperCase();
        System.out.println("q = " + q);
        q=q.toLowerCase();
        System.out.println("q = " + q);
    }
}
