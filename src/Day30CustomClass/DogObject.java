package Day30CustomClass;

import java.util.ArrayList;

public class DogObject {

    public static void main(String[] args) {

      Dog dog1=new Dog();//new Dog=object dir
        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.gender='F';
        dog1.age=5;
        dog1.size="Small";
        dog1.color="white";
        System.out.println("dog1 = " + dog1);//hasdeccode verir to string kurunca tamammını vereir

        Dog dog2=new Dog();
        dog2.name="Ace";
        dog2.breed="Husky";
        dog2.gender='M';
        dog2.age=5;
        dog2.size="Large";
        dog2.color="Brown";
        System.out.println("dog2 = " + dog2);

        Dog dog3=new Dog();
       dog3.setInfo("Jack","German",2,'M',"large","Brown");
      System.out.println("dog1 = " + dog1);
      System.out.println("dog2 = " + dog2);
      System.out.println("dog3 = " + dog3);

      dog1.eat();
      dog2.bark();

      Dog dog4=new Dog();
      dog4.setInfo("Bullet","Labrador",3,'M',"Extra Large","Yellow");
      Dog dog5=new Dog();
      dog5.setInfo("Sully","pitbull",6,'M',"Large","Black");
      System.out.println("-------------------------------");

      Dog [] dogs={dog1,dog2,dog3,dog4,dog5};
      ArrayList<Dog>femaleDogs=new ArrayList<>();//loop kullanabilirsin
      ArrayList<Dog>maleDogs=new ArrayList<>();




    }
}
