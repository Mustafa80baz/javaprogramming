package Day31Constructor.Scrum;

public class Tester {
    public String name;
    public int employeeId;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Scrum{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary  $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+"is smoke testting");
    }
    public void cratingTikcet(){
        System.out.println(name+"is creating ticket");
    }



}
