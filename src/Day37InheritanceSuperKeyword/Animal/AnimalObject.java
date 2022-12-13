package Day37InheritanceSuperKeyword.Animal;

public class AnimalObject {
    public static void main(String[] args) {
        Dog dog1=new Dog("Lucy","German",'F',3,"small","black");
                System.out.println("dog1 = " + dog1);
        dog1.bark();

        Cat cat1=new Cat("pisi","yerli",'M',4,"big","white");
        System.out.println("cat1 = " + cat1);
        cat1.scratch();
    }
}
