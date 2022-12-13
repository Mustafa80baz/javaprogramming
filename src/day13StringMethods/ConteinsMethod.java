package day13StringMethods;

public class ConteinsMethod {
    public static void main(String[] args) {
        String a="My faorite programme is java";
      boolean hasCsharp= a.contains("C#");
        System.out.println(hasCsharp);
        boolean hasJava=a.contains("Java");
        System.out.println("hasJava = " + hasJava);
        boolean hasJava1=a.contains("java");
        System.out.println("hasJava1 = " + hasJava1);
        boolean hasJava2=a.toLowerCase().contains("java");//büyük küçük harf hepsine bakma yolu/fark etmez
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("-------------------------------------");
        String input1="l love JAvA";
        String input2="Java";
        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));//
        System.out.println(input1.contains(input2));//true
        System.out.println(input1.toLowerCase().contains("java"));//tru


    }
}
