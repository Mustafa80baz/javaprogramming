package week3_day07_Operators.ÖrnekUygumalarıfStatement;

public class PostNegZeroOrnek {
    public static void main(String[] args) {

        int n=0;
        boolean IsPosi =n>0;
        boolean IsNeg=n<0;
        boolean IsZero=n==0;

        if(IsPosi){
            System.out.println(" Positive" );
        } else if (IsNeg ){

            System.out.println(" Negative " );


        }else {
            System.out.println("Zero");
        }

    }
}
