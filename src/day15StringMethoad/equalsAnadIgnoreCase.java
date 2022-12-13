package day15StringMethoad;

public class equalsAnadIgnoreCase {
    public static void main(String[] args) {
        String a1="Cydeo";
        String a2="CYDEO";
        boolean as=a1.equals(a2);// kelime anlamı aynı olsa da buyuk kuçuk harf farklılıgından dolayı eşit delğiller
        System.out.println("as = " + as);//false
        System.out.println("-----------------------------");
        boolean de=a1.equalsIgnoreCase(a2);
        System.out.println("de = " + de);// true cunki buyuk kuuck harf duyarlılıgını kaldrı dedım
    }
}
