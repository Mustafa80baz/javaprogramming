package Day32RecapConstructor;

import java.util.Arrays;

public class StutendObject {
    public static void main(String[] args) {
        Student student1=new Student("Ali");
        Student student2=new Student("Veli",'M');
        Student student3=new Student("Vali",'M',32);
        Student student4=new Student("Kemal",'M',34,22);
        Student student5=new Student("Kemaliye",'F','A',56,45);

        System.out.println(student2==student1);
        Student[]students={student1,student2,student3,student4,student5};
        System.out.println(Arrays.toString(students));

    }
}
