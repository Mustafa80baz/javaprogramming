package Day37InheritanceSuperKeyword.ScrumTeams;

public class Employee extends Persons {//child Klass
    public String jobtitle;
    public  int id;
    public double salary;
    //bunlar herkes için farklı odogundan bura da tanımladık
    public String companyName;

    public Employee(String name, int age, char gender, String jobtitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobtitle = jobtitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }
    public void work(){
        System.out.println(jobtitle+" "+name+" is working");

            }

    public String toString() {
        return "Employee{" +
                "jobtitle='" + jobtitle + '\'' +
                ", id=" + id +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
