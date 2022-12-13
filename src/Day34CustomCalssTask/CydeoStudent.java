package Day34CustomCalssTask;

public class CydeoStudent {
    public String name;
    public char gender;
    public  int age;
    public  int batchNumber;
    public int groupNUmber;
    public static String schoolNmae;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNUmber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNUmber = groupNUmber;
        this.fieldOfStudy = fieldOfStudy;
    }
    static {
        schoolNmae="CYDEO";
        programmingLanguage="jAVA";
        secretCode="Wooden Spoon";

    }

    public static void printschollName(){
        System.out.println("Schooll name  is :"+ schoolNmae);
    }
    public static void printProgrammingLanguage(){
        System.out.println("Language name is : "+programmingLanguage);
    }
    public  void attendClass(){
        System.out.println(name+"is attending Class");
    }
    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNUmber=" + groupNUmber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolNmae + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }
}
