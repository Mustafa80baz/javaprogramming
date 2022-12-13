package Day32ConstructorOverLoading;

public class Test {
    public Test(){//A cıktı
        System.out.println("A");
    }
    public Test(int a){//AB cıktı
        this();
        System.out.println("B");
    }
    public Test(double a){//ABC cıktı
        this(10);
        System.out.println("C");
    }
    public Test(String str){//ABCD cıktı
        this(2.3);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test();//A
        new Test(10);//AB
        new Test(2.3);//ABC
        new Test("Java");//ABCD
    }
}
