package ZulphikarWeek4ifStatement;

public class MultibranchIfStatement {
    public static void main(String[] args) {
/*
// 3. check kids age, decide which school they should go to
    /*
    0-2 at home
    3-6 kindergarten
    7-12 primary school
    */

int age=11;

           if(age<=2){
               System.out.println("Sleep at home");
           } else if (age>=3&&age<=6) {
               System.out.println("KinderGaerden");
           } else if (age>=7&& age<=12) {
               System.out.println("Primery School");

           }else {
               System.out.println("please enter prober number");
           }

    }

}
