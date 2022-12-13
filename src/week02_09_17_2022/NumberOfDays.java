package week02_09_17_2022;

public class NumberOfDays {
    public static void main(String[] args) {

        /* create a class called number of days,write a program that can print teh number of daysin a month


        Ex:
        number=1
        output=31 days
        Hints:
        Monts thathas 31 days:1,3,5,7,8,10,12
        months has 30 days :,4,6,11
        Month has 28 days: 2
         */

        int number=5;//1~12

         boolean has28days=number==2;
         boolean has30Days=number==4||number== 6|| number== 11;// 30 gün çeken aylar
         boolean has31Days=number==1|| number ==3 ||number==5 || number ==7 || number==8 || number==10|| number==12;//31 çeken aylar için
        boolean has31Days1=!has28days && !has30Days; //28 ve 30 çeken aylar hariç

        if(has28days){ // 28 gün çekiyorsa
            System.out.println("28 days");

        }
         if(has30Days){// 30 gün çekiyorsa
             System.out.println("30 days");

         }
      if(has31Days){// 31 gün çekiyorsa


      }

    }
}
