package Day27WrapperClass;

public class WrapperClassesIntro {

    public static void main(String[] args) {
        int num1=20;
        Integer n1=num1;//autoboxing
    int num2=n1;//unboxing
        System.out.println("-------------------------------");
        Integer integerValue=200;
        long  longValue= integerValue;
        //buyuk harfle olursa"Integer,Byte vs wrapper class oluyor ve kucuk harfle olan butun (primitive)hepsini cevriliyor
        Byte b1=20;//bu Byte wrapper class oldugundan butun primitivlere dönuşebilir.
        byte a1=b1;         short c1=b1;   int c11=b1;   long a11=b1;
        //bunun tesi olsa byte b1:20 olsa ancak Byte sa=b1 ;olur başka olmaz
        System.out.println("------------------------------------");
        int num3=200;
        //Long l2=num3;compiler err.
        Integer num4=num3;//autoboxing
        System.out.println("-------------------------------");
        Integer z=900;
        Integer y=z;

    }
}

