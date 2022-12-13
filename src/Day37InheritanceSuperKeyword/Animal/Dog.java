package Day37InheritanceSuperKeyword.Animal;

public class Dog extends Animal {
   // public int a;//extradan birsey eklenecekse böyle yazılır ve alta eklenir
public Dog(String name, String breed, char gender, int age, String size, String color){
    super(name, breed, gender, age, size, color);
   // this.a=a;
}
public void bark(){
    System.out.println(name+ " is barking");

}
}
