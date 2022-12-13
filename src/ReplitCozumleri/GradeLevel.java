package ReplitCozumleri;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        int grade = s.nextInt();

        if(grade>=90){
            System.out.println("Exelent");

        }else if (grade>=70){
            System.out.println("good");
        } else if (grade>=60) {
            System.out.println("pass");

        }else {
            System.out.println("failed");
        }
    }
}
