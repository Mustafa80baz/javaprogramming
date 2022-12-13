package Day24CustomMethodReturn;

public class RetunMethodPractice2 {
    public static void main(String[] args) {
        //crate a function that can calculate the grade
       String str1= garde(67);
        /*
        graed;
        'A'====>EXCELENT
        'B'===>Great
         */
        if (str1.equals("A")){
            System.out.println("Excelent");
        } else if (str1.equals("B")) {
            System.out.println("Great");

        } else if (str1.equals("C")) {
            System.out.println("Good");

        } else if (str1.equals("D")) {

            System.out.println("Passed");
        }else {
            System.out.println("Try again");
        }
    }
    public static String garde(int score){
        String result="";
        if (score<0  || score>100){
            System.out.println("invalid score");





        }else {
            result=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
        }
        return result;
    }
}
