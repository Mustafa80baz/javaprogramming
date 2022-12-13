package PracticeTaskDay08;

public class gradeLevel {
    public static void main(String[] args) {

        byte n=7;

        if (n>=1&& n<=5){
            System.out.println("Elementary school");
        } else if (n>=6 && n<=8) {
            System.out.println("Middle School");
        } else if (n>=9 && n<=12) {
            System.out.println("High school");

        } else if (n>=13 && n<=16){
            System.out.println("College");

        }else {
            System.out.println("Grand School");
        }
    }
}
