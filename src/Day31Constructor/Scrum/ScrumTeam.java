package Day31Constructor.Scrum;

public class ScrumTeam {
    public ScrumTeam(String PO, String BA, String SM, int daysofSpringi) {
    }
    private Tester[] testersList;

    public static void main(String[] args) {

        // 3 testers object
        Tester testers1=new Tester("Layan",11,"QA",1100000);
        Tester testers2=new Tester("Ali",43,"SDET",3400000);
        Tester testers3=new Tester("Alex",44,"QA",5500000);
        Tester testers4=new Tester("Lala",23,"QA",6600000);
        Tester [] testers={testers2,testers2,testers3};
        //4 developers object
        Developer develepor1=new Developer("Olga",22,"QA",760000);
        Developer develepor2=new Developer("Aygun",39,"QA",7400000);
        Developer develepor3=new Developer("Tunc",29,"QA",720000);
        Developer develepor4=new Developer("Sinem",13,"QA",3700000);
        Developer [] developers={develepor1,develepor2,develepor3,develepor4};

               // scrum team object

      ScrumTeam scrum=new ScrumTeam("Nigara","Huseyin","Neira",14);
     // scrum.addTesters(testers);
        // scrum.addDevelopers(developers);

        System.out.println("------------------------------------------");
        for (Tester eachTester :scrum.testersList) {

        }


    }


}
