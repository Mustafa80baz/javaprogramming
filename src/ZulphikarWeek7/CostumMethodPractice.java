package ZulphikarWeek7;

public class CostumMethodPractice {
    public static void main(String[] args) {
         space(" this is java iffice hour    ");
         invesment(200,3,3);
        System.out.println(leap(2000));
    }
    //write a method  count the space in given string  then print the number pf space "this is java iffice hour"->5
    public static   void space( String str){
        int count = 0;
            for (int i = 0; i < str.length(); i++){
                if(str.charAt(i) == ' '){//butun harleri ve boşlukları tek tek bakar
                    count++;

            }

        }
        System.out.println(count);
    }
    /*
    write a program to calculate money in your bank account
    method receives 3 arguments : original amount,rate,year
      */
    public static void invesment(double originalAmount,double rate,int year){
        for (int i = 0; i <year ; i++) {
            originalAmount=+originalAmount+originalAmount*rate;

        }
        System.out.println("total Amount"+originalAmount);
      //  double totalAmount = originalAmount + originalAmount * rate; bir yılda alacagı faizin hesabı

    }
    //we have 2 types of custom methods according to what they do
    //voıd type is not returninig anything
    //task 4 write a kethod ,check if the given year is leap year or not.return boollean

    public static  boolean leap(int year){
        boolean isleapYear= false;
        if (year %4==0){
            isleapYear=true;


        }
        return isleapYear;

    }

}
