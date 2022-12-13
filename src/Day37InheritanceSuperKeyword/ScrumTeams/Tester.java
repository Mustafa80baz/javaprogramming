package Day37InheritanceSuperKeyword.ScrumTeams;

public class Tester extends Employee  {// tester is an Employee,and tester is a person

    public Tester(String name, int age, char gender, String jobtitle, int id, double salary, String companyName) {
        super(name, age, gender, jobtitle, id, salary, companyName);
    }
    public void createTicket(){
        System.out.println(jobtitle+" "+name+" is creating ticket");
            }
}
