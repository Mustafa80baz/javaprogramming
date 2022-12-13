package weekday09IfDevam;

public class NnumberOfDays {
    public static void main(String[] args) {

        /*
        28 days:2   30 ceken :4 6 9 11
        31 gün olan ay:1 3 5 7 8 10 12
         */
        int year=2000;
        int ay=6;
        String result="";

       if (ay>=1 && ay <=12){//if le formülu
        //    if(ay==1){
           //     System.out.println("31 gün");

switch (ay){
    case 1:  case 3: case 5:case 7:case 8: case 10: case 12:
        result="31 days";
        System.out.println("31 days");
        break;
    case 2:
        if ((year&4)==0){
            result=(year %4==0)? "29 days":"28 days";
        }

        break;
    case 4:case 6:  case 9:  case 11:
       result="30 days";
        break;

        default:
            result="öyle bir ay yok";
        }

        System.out.println(result);
        }


    }

}
