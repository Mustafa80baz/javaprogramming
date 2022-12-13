package Week12AdamEmployee;

public class Employee {
    public String name;
    public int Id;
    public char gender;

    public Employee(String name, int id, char gender) {
        this.name = name;
      this.Id = id;
        this.gender = gender;
    }
    public Employee(String name){
        this.name=name;
    }
    public Employee(String name,int id){
        this.name=name;
        this.Id=id;
    }




    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", gender=" + gender +
                '}';
    }
}
