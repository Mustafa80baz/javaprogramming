package Day34GarbageCollection_AccessModifires;

public class AccesModifiersTest {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
       // System.out.println(AccessModifiers.privateData);oluşturuldugu class dısında biryerde kullnılamaz

        AccessModifiers.method1();
        AccessModifiers.method2();
        //AccessModifiers.prvate() private burada calişmaz

    }

}
