package Day34GarbageCollection_AccessModifires;

import Day30CustomClass.Dog;
import Day31Constructor.Student;
import Day32ConstructorOverLoading.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {
      String str=null;//sadece non primiteiveler de kullanılır,defoult olara kullanılır
        String sd="";// nulldan farklı
      //  int n=null; primiteve oldugundan kullanılmaz

        String str1="Wooden Spoon";//str referanca  W..Soppon is object.
        str1=null;
        System.out.println(str1);//null verıir


    Car car1=new Car("Toyota");
        System.out.println("car1 = " + car1);
    car1=null;
        System.out.println(car1);


        System.out.println("-----------second way---------to make null------");
        Dog dog1=new Dog();
        dog1.name="Lucy";
        System.out.println("dog1 = " + dog1);
        dog1=new Dog();//2.dog. dog1 artık max oldu vw lucy garbageiçin uygun hle geldi
        dog1.name="Max";
        System.out.println("dog1 = " + dog1);


        String language="Python";//garbage oldu
               language= "java";
        System.out.println("language = " + language);
        System.out.println("-----------bir object 2 refernace mümkün mu--------------------");

        ArrayList<Integer >list1=new ArrayList<>();
        list1.add(100);//aynı zamanda list2 nın de elementi oldu

        ArrayList<Integer>list2=list1;// list1 ıkı ayrı referansı oldu
        list2.addAll(Arrays.asList(200,300,400));
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);;
        System.out.println(list1==list2);

        System.out.println("-------------------------------------");

        Student student1=new Student("Tahir",30,'M','B',14);
        student1.grade='A';
        Student student2=student1;
        student2.name="Ahmet";//2 sinde de isimler ahmet olur
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("--------------------------------");





    }

}
