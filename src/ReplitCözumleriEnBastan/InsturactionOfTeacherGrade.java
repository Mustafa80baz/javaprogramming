package ReplitCözumleriEnBastan;

import java.util.Scanner;

public class InsturactionOfTeacherGrade {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String subject1, subject2,subject3,subject4,subject5,Summuray;
        double garde1,garde2,garde3,garde4,garde5,average;
        System.out.println("Welcome to the Grader");
        System.out.println("Please enter subject name and number1 ans score for the math");
   subject1=scan.next();
   garde1= scan.nextDouble();
        System.out.println("Please enter subject name and number1 ans score for the math");
        subject2=scan.next();
        garde2= scan.nextDouble();
        System.out.println("Please enter subject name and number1 ans score for the math");
        subject3=scan.next();
        garde3= scan.nextDouble();
        System.out.println("Please enter subject name and number1 ans score for the math");
        subject4=scan.next();
        garde4= scan.nextDouble();
        System.out.println("Please enter subject name and number1 ans score for the math");
        subject5=scan.next();
        garde5= scan.nextDouble();
       Summuray="Sumamry:"+subject1+"-"+garde1+
                            subject2+"-"+garde2+
                            subject3+"-"+garde3 +
                            subject4+"-"+garde4 +
                             subject5+"-"+garde5;

       average=(garde1+garde2+garde3+garde4+garde5);
        System.out.println(average);
    }

}
