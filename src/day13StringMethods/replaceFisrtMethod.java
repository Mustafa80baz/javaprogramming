package day13StringMethods;

public class replaceFisrtMethod {
    public static void main(String[] args) {

        String result="Java Java Java";//replace = replace all
        result=result.replace("Java","Tava");
        System.out.println(result);
        System.out.println("result = " + result);
        System.out.println("---------------------");
        String tr="Java Java Java";
        System.out.println("tr = " + tr);
        tr=tr.replaceFirst("Java","Tava");// replace first sadece 1. yi replace
        tr=tr.replaceFirst("Java","kova");
        System.out.println("tr = " + tr);
        String hk="C# is fun C# is cool";
        hk=hk.replaceFirst("C#","Java");
        System.out.println("hk = " + hk);


    }
}
