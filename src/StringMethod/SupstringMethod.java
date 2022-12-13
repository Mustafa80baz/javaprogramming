package StringMethod;

public class SupstringMethod {
    public static void main(String[] args) {

        String str="Java Programming Language";
       // str=str.substring(str.indexOf("P"));
        System.out.println("str = " + str);
      String result=str.substring(5,16);//tek tek sayarak yaptık
        System.out.println("result = " + result);
        System.out.println("---------------------");
        // kacıncı harf olduğunu saymadan yapmanın formulu
        String result1=str.substring(str.indexOf("P"),str.lastIndexOf(" "));
        System.out.println("result1 = " + result1);
        System.out.println("-----------------------------------");
        String n="I love Nihal";
        String n1=n.substring(0,1);
        System.out.println(n1);
        String n2=n.substring(n.indexOf("l"),n.indexOf("N"));
        System.out.println(n2);
        String qw3=n.substring(n.lastIndexOf(" ")+1);
        System.out.println("n3 = " + qw3);
            //String.h3=n.substring(n.lastIndexOf(" ")+1);
     //  String.kl=n.substring(n.lastIndexOf(" ")+1);

    }
}
