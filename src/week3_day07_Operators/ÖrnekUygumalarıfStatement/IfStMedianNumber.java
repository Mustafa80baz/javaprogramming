package week3_day07_Operators.ÖrnekUygumalarıfStatement;

public class IfStMedianNumber {
    public static void main(String[] args) {
       int a=10;

       int b =15;
       int c=20;
       if(b>a && b<c ){
           System.out.println(b +"= is the median number");
       } else if (b <c &&b >a) {
           System.out.println("yine aynı");
       }

    }
}
