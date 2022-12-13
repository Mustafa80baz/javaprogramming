package Day31Constructor.Scrum;

import java.util.ArrayList;
import java.util.Arrays;

public class Scrum {

public String PO,BA,SM;
public ArrayList<Tester>testerList=new ArrayList<>();

    public ArrayList<Developer>developerList=new ArrayList<>();
    public int daysOfSprint;

    public Scrum(String PO, String BA, String SM, ArrayList<Tester> testerList, ArrayList<Developer> developerList, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.testerList = testerList;
        this.developerList = developerList;
        this.daysOfSprint = daysOfSprint;
    }

   public void addTester(Tester tester){
        testerList.add(tester);
   }
    public void addTesters(Tester[]testers){
    testerList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        developerList.add(developer);

    }
    public void alldevelopers(Developer[]developers){
        developerList.addAll(Arrays.asList(developers));
    }


    public void removeTester(int employeeID){
        testerList.removeIf(p-> p.employeeId==employeeID);

    }
    public void removeDeveloper(int employeeID){
        developerList.removeIf(p->p.employeeId==employeeID);

    }


    public String toString() {
        return "Scrum{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ",total number of tester=" + testerList.size() +
                ",total number of developer=" + developerList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
