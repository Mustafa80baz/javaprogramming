package PracticeTaskDay09_1;

public class FieldGradeTrip {
    public static void main(String[] args) {

        int grade=4;


        if (grade>=1 && grade<=6){
            if (grade==1){
                System.out.println("location -Apple orchard \n Number of group-3\n teacher in charge-Ms.smith");

            } else if (grade==2) {
                System.out.println("location -Aquarium \n Number of group-5\n teacher in charge-Ms.Wilson");
            } else if (grade ==3) {
                System.out.println("location -Zoo \n Number of group-7\n teacher in charge-Mr Lee");

            } else if (grade==4) {
                System.out.println("location -Movie Theater \n Number of group-2\n teacher in charge-Ms.Reyes");

            } else if (grade==5) {
                System.out.println("location -Museum \n Number of group-5\n teacher in charge-Ms.Lela");

            } else  {

                System.out.println("location -Six Flag \n Number of group-8\n teacher in charge-Ms.watt");
            }

        }else {

            System.out.println("Bir yere gidemez");
        }

    }
}
