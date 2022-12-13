package StringMethod;

public class ReplacMethod {
    public static void main(String[] args) {
        String atr="Wooden Spoon";
       atr=atr.replace("o","e");
        System.out.println("atr = " + atr);
        String as="I love Java, Java is the best Programming language";
        System.out.println("as = " + as);// replacment le java yerine c3 yazdırdık
        as=as.replace("Java","C#");
        System.out.println("as = " + as);
        as=as.replace("C#","Java");//7eski haline gelir
        System.out.println("as = " + as);
        System.out.println("---------------------------");

        //replace first metod
String rg="HAydar java,java haydar";
                rg=rg.replaceFirst("A","a");
        System.out.println("rg = " + rg);
        rg=rg.replaceFirst("java","tava");
        System.out.println(rg);
    }
}
