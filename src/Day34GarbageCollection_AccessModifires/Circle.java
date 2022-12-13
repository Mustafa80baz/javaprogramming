package Day34GarbageCollection_AccessModifires;

public class Circle {
    public double radius;
    public static double pi;
    public static String name="Circle";

    public Circle(double radius){
        this.radius=radius;
        pi=3.14;//bu static bir veri  bunu birden fazla consturtor kullanacaksan buarada kullanma
    }
    static {//intance veriyi kabul etmez
        //radius =5 static bunu kabul etmez
        pi=3.14;
        name="Circle";

    }
}
