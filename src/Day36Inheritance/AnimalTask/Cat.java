package Day36Inheritance.AnimalTask;

public class Cat extends Animal{//cat child and Animal parent
    public void meow(){
        System.out.println(name+"is meowing");
    }
    public void scratch(){
        System.out.println(name+" is scratching");
    }

}
