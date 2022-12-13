package Day34GarbageCollection_AccessModifires;

public class CydeoStudent {
    public String studentName;
    public static String schoolName;
       public CydeoStudent(String studentName){
        this.studentName=studentName;
        schoolName="Cydeo School";
    }

}
class CydeoStudentObject{
    public static void main(String[] args) {
       CydeoStudent student1=new CydeoStudent("Jimmy");
        CydeoStudent student2=new CydeoStudent("Kathy");

        ;
    }

}


