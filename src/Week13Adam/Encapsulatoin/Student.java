package Week13Adam.Encapsulatoin;

public class Student {

    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.equals("xxx")){
            System.out.println("sacmalama böyle isim olmaz");

        }
        this.name = name;
    }

       public void setAge(int age) {
        if (age<0){
            System.out.println("düzgün yaz len");

        }
        this.age = age;
    }



    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
