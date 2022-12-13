package Utilities;

import Day34GarbageCollection_AccessModifires.AccessModifiers;

public class AccesModifiers_Test2 {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);//heryerde calısır
      //  System.out.println(AccessModifiers.defaultData);kendi pakage dişinda calışmaz
        //System.out.println(AccessModifiers.privateDate);bu kendi  pakage ve klassı dısında çalışmaz
AccessModifiers.method1();//heryerde çalişir
       // AccessModifiers.method2();kendi pakage dişinda calişmaz
     //   AccessModifiers.method3();// bu kendi oluştgu yerdenbaşka calişmaz

    }
}
