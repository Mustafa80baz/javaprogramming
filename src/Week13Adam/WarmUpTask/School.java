package Week13Adam.WarmUpTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {

         /*
    2. create a class which is School with main method
    3. create a list of teacher in School class inside the STATIC BLOCK
    4. create a method in School class which is returning the list of teachers if the last name start with "M"
    5. create a method in School class then you will find the female teachers
    6. create a method in School class then find the teachers age smaller than 30
    7. create a methot in School class then find the teachers born in 1967 year

     */
        static ArrayList<Teacher>teachers=new ArrayList<>();//başına static koyarak static içindeki bilgilere ulaşabiliriz.

    static {//bunları arrayliste eklemek için array list ti de ststtic yapmak gerek
      //  ArrayList<Teacher>teachers=new ArrayList<>();//burada static içinde olursa diğer metodlartarafından  çağıramayız// tatsic dışına cıkaracaz
        Teacher teacher1=new Teacher("nihal","baz",'F', LocalDate.of(2012,1,12),1);
        Teacher teacher2=new Teacher("Sali","baz",'M', LocalDate.of(2003,1,19),2);
        Teacher teacher3=new Teacher("Numan","baz",'M', LocalDate.of(2001,1,12),3);
        Teacher teacher4=new Teacher("Fatma","baz",'F', LocalDate.of(1980,1,11),4);
teachers.addAll(Arrays.asList(teacher1,teacher2,teacher3,teacher4));


    }
        public static void main(String[] args) {
            System.out.println(teachers);
           //ArrayList<Teacher>result=getTeachersNameStarsWith("M");
           // System.out.println(result);
        //  ArrayList<Teacher>females=getTeacherByGender('F');



    }


}


