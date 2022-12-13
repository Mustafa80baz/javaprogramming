package Day36Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setInfo("Max","Husky",'M',3,"smal","brown");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        System.out.println("dog = " + dog);
        Tiger tiger=new Tiger();
        Cat cat=new Cat();
        cat.setInfo("tarcın","British",'M',3,"Small","Grey");
cat.eat();
cat.drink();
cat.move();
cat.sleep();
cat.scratch();
        System.out.println("cat = " + cat);
        Tiger tiger1=new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'F',4,"Large","Brown");
        tiger.roar();
        tiger.hunt();
        tiger.eat();
        tiger.move();
        tiger.drink();
        System.out.println("tiger1 = " + tiger1);


    }
}
