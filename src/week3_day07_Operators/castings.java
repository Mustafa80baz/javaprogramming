package week3_day07_Operators;

public class castings {

    public static void main(String[] args) {

     /*
        byte num1;
        short num2;
        int num3;
        long num4;
        float num5;
        double num6;


   */

   float avarageScore=(float) 20.5;
   byte num1= (byte) avarageScore;// explicit casting
        System.out.println("num1="+num1);

        short num2= (short)avarageScore;
        System.out.println("num2="+num2);
         int num3=(int)avarageScore;
        System.out.println("num3="+num3);
        long num5=(long)avarageScore;


        float num4=avarageScore;
        double num6=avarageScore;

        System.out.println(num6);

        System.out.println(45%6);
        System.out.println("----------------");

        int h=10;
        int U=3;
        int division=h/U;

        int reminder=h%U;

        System.out.println(h+" divided by " +U+ " is equal to "+division+" with reminder of "+reminder);


        System.out.println("--------------------------------------");
        byte q=112;
        int s=q;
        double w=234;
        int w1=(int)w;
        System.out.println("--------------------------------");
        System.out.println(20/3f);

        System.out.println(20.5%3);


    }
}
