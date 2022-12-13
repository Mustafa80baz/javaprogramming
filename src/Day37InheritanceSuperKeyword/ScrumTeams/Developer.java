package Day37InheritanceSuperKeyword.ScrumTeams;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, String jobtitle, int id, double salary, String companyName) {
        super(name, age, gender, jobtitle, id, salary, companyName);
    }
    public void fixbugs(){
        System.out.println(jobtitle+" "+name+"is fixing" );
    }
}
