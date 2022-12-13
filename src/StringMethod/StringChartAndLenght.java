package StringMethod;

public class StringChartAndLenght {
    public static void main(String[] args) {
        String str="Mustafa"; // 0 dan başlar 5 harli kelime 0 da başlar 4 de biter. Boşluklarda karakterdr
            //      012345
      char a=str.charAt(2);
        System.out.println(a);
        char b=str.charAt(4);
        System.out.println(b);
        char c=str.charAt(5);
        System.out.println(c);
        System.out.println("----------------------");
        int y =str.length();
        System.out.println(y);//7 Mustafa da yedi harf var
        String cd="Fatma";
        char f=cd.charAt(2);
        int cd2=cd.length();
        System.out.println("f = " + f);
        System.out.println("cd2 = " + cd2);


    }
}
