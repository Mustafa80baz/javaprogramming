package Week13Adam.WarmUpTask;

import java.time.LocalDate;

public class Teacher {

    public String name,lastname;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    public long id;

    public Teacher(String name, String lastname, char gender, LocalDate dateOfBirth, long id) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        //how to get the date  for today
        int currentYear=LocalDate.now().getYear();//
        int yearOfDateOfBirth= dateOfBirth.getYear();
        this.age =currentYear-yearOfDateOfBirth;
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    /*

     1. create a class named Teacher that has the followings features:
            Attributes:
                name,lastName, gender, dateOfBirth(use LocalDate), age, id
            Methods:
                sets all the attributes of the teacher object
                toString(): returns the full info of teacher Object
    2. create a class which is School with main method
    3. create a list of teacher in School class inside the STATIC BLOCK
    4.create a method in School class which is returning the list of teachers if the last name start with "M"

    5. create a method in School class then you will find the female teachers

    6. create a method in School class then find the teachers age smaller than 30

    7. create a methot in School class then find the teachers born in 1967 year
     */
}
