package day15StringMethoad;

public class StartsWithAndEndsWith {
    public static void main(String[] args) {
        String a="Wooden Spoon";
        boolean aa=a.startsWith("W");//sadece W ye bakar
        System.out.println("aa = " + aa);
        boolean b=a.endsWith("Spoon");
        System.out.println("b = " + b);//sadece S e bakar
        // harf duyarlılıgını kaldırmak icin öce uppcase yada loower case cağır
        boolean as=a.toUpperCase().endsWith("SPOON");// buyuk harle de kucukle de yazılmış olsa s lbitiyorsa cevap verir
        System.out.println("as = " + as);
        boolean de=a.toLowerCase().startsWith("wooden");
        System.out.println("de = " + de);



    }
}
