package Week12AdamEmployee;

public class Student {
    public String name;
    public int age;
    public  long batchNumber;

    public static String school="Cydeo";

    public Student(String name) {//1st constructor: initializes the name ONLY
        this.name = name;
    }

    public Student(String name, int age) {// 2nd constructor: initializes name & age
        this(name);//this.name = name;
        this.age = age;
    }
    public Student(String name, int age, long batchNumber) {// 3rd Constructor: initializes name, age ,batchNumber
        this(name,age);
        this.batchNumber = batchNumber;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", scholl=" +school +
                "} " ;
    }
    /*
    ask 1:
 Class Name: Student
        instance variables: name, age, batchNumber
        static variables :  school
        (MUST use constructor call to set the name)? çözüm=(this(name);böyle de yapılır
        (MUST use constructor call to set the name & age)
        instance methods: toString()
     */
}
