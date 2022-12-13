package Day35Encapsulation.Encapsulation;

public class personObject {
    public static void main(String[] args) {
        Person p1=new Person();
        //p1.name="daniel"; private oldugundan  erroro verir
        p1.setName("Daniel");;
        p1.setAge(28);
        System.out.println(p1.getName()+" : "+p1.getAge());
        System.out.println("p1 = " + p1);
    }
}
