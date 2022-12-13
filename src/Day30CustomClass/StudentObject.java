package Day30CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {
        Students students1=new Students();
        students1.setInfo("Aygun",'F',39,2202,'A');
        System.out.println(students1);

        Students students2=new Students();
        students2.setInfo("Hulya",'F',26,2123,'A');
        Students students3=new Students();
        students3.setInfo("Elminur",'F',26,2210,'A');
        Students students4=new Students();
        students4.setInfo("Ali",'M',28,5511,'B');
        Students students5=new Students();
        students5.setInfo("Mert",'M',26,2252,'C');
        Students [] students={students1,students2,students3,students4,students5};

        for (Students eachstudent : students) {//her bir ögrenciyi array a koymak için..student object in array
            System.out.println("each = " + eachstudent);
        }
        System.out.println("-------kactanesi earlyBirds'a uygun-------");

        ArrayList<Students>earlyBirds=new ArrayList<>();//grade 'A' ise eraly bird
        ArrayList<Students>angrBirds=new ArrayList<>();//digerleri angryBird

        for (Students each : students) {//early bird ve angry birdleri listelemek için
            if (each.grade=='A'){
                earlyBirds.add(each);
            }else {
                angrBirds.add(each);

            }

        }

        System.out.println(earlyBirds);//2 bundan
        System.out.println("angrBirds = " + angrBirds);//bundan 3 kişi var mış
    }
}
