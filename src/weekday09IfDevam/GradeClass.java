package weekday09IfDevam;

public class GradeClass {
    public static void main(String[] args) {
        int score=80;

        char grade;
      String  result ="";
if(score>=0 &&score<=100 ){

    if (score>=90){
        grade='A';
    } else if (score>=80) {
        grade='B';

    } else if (score>=80){
        grade='C';
    } else if (score>60) {
        grade='D';
    }else {
        grade='F';
    }

    System.out.println(grade);

    }else {
    System.out.println("Invalid note");
    }


        System.out.println("-----------------------------------");
//şidide bunu turneria  olarak yapalım

        char garde1=(score>=90)? 'A':(score>=80)? 'B':(score>=70)?'C':(score>=60)? 'D':'F';
        System.out.println(garde1);
        }

    }

