package week02_09_17_2022;

public class ConvertMinuteYearAndDay {

    public static void main(String[] args) {

/*60 minutes in 1 hour
24 *60 minutes in 1 day
365 day ina year
365*24 hours ina year


int minute



 */

int minute=60;// in one hour
        int dayHour=24;
        int year=365;
        int dayMunite=minute*year;
        System.out.println("Minute in aday="+dayMunite);
        double day=1440*365;
        System.out.println("day in a year="+ day);


        int i=3456789; // given minutes how many years
       int minutesyears1=52560;
            System.out.println(24*365*60);
    int bul=i/minutesyears1;
            System.out.println(bul);
        int yearHour=365;
int yearHoursonuc=yearHour*dayHour;

        System.out.println("yearHoursonuc="+yearHoursonuc );

double son=yearHoursonuc*minute;

        System.out.println(son);




    }




}
