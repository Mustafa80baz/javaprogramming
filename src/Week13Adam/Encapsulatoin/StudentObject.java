package Week13Adam.Encapsulatoin;

public class StudentObject {
    public static void main(String[] args) {
        Student student=new Student();
      //  student.name="xx";
        //student.age=-12;
        student.setAge(-12);
        student.setName("Adam");
        System.out.println( student);
        System.out.println(student.getAge());
        System.out.println(student.getName());



    }
}
