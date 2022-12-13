package Day37InheritanceSuperKeyword.ScrumTeams;

public class Persons {//parent klass
    public String name;
    public int age;
    public char gender;

    public Persons(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+" is eating  food");

    }
    public void drink(){
        System.out.println(name+" is drinking ");

    }

    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
