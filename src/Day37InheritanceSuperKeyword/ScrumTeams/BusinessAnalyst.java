package Day37InheritanceSuperKeyword.ScrumTeams;

public class BusinessAnalyst extends Employee  {
    public BusinessAnalyst(String name, int age, char gender, String jobtitle, int id, double salary, String companyName) {
        super(name, age, gender, "Buniss Analyst", id, salary, companyName);
    }

}
