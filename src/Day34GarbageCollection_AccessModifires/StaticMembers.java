package Day34GarbageCollection_AccessModifires;

public class StaticMembers {//neler ststick olabilir// bu statıc olamaz
    int a;
  static    class class1{//nested klas bu statick olabilir

    }
    public static  int num=100;

    public static void main(String[] args) {

    }
    static {

    }
}
class A{// bu statıc olamaz
  static   class B{// a clasının  bir parçası oldugu için statıc olur içi içe olacak ki statıc olsun
public static void method1(){

}
    }
}
class C{// method 1 cagırmak için önce ana klas A yı sonra Alt klas B yi sobrada methodu cagır

    public static void main(String[] args) {
        A.B.method1();
    }
}