package day13StringMethods;

public class replaceMethod {
    public static void main(String[] args) {
        String a="Java is fun, ı love learninig java";
        String b=a.replace("java","python");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("--------------------");
        String n1="buarası Isparta orası neresi";
        System.out.println("n1 = " + n1);
        n1=n1.replace("buarası","burası");
        System.out.println("n1 = " + n1);
String ad="mustafa baz";
        System.out.println("ad = " + ad);
ad=ad.replace("baz","BAZ");
        System.out.println("ad = " + ad);
        String degis="javam ama  kama dala atava";
        System.out.println("degis = " + degis);
        degis=degis.replace("dala"," ");
        System.out.println("degis = " + degis);
        System.out.println("------------------------------------------");
        String s="Dog Dog Dog Dog Dog Dog";
        System.out.println("s = " + s);
        s=s.replace("Dog","Cat");
        System.out.println("s = " + s);
        System.out.println("----------------------");
        String s2="C# is fun, C# is cool";
        System.out.println(s2);
        s2=s2.replace("C#"," Java");
        System.out.println("s2 = " + s2);
        s2=s2.replace("C#","C# is cool");
        System.out.println("s2 = " + s2);

        System.out.println("-----------------------------");
        String hg="java";
        hg=hg.replace("a","e");
        System.out.println("hg = " + hg);


    }
}
