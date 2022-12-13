package week3_day07_Operators.ÖrnekUygumalarıfStatement;

public class NameOfTheDay {
    public static void main(String[] args) {

        int n=5;//1~7 gün var
        String day;

        if(n==1){
           // System.out.println("Günlerden Monday");
            day="Monday";
        } else if (n==2) {
            System.out.println(" Tuesday");

        } else if (n==3) {
            System.out.println(" Wednday");

        } else if (n==4) {
            System.out.println(" Tursday");

        } else if (n==5) {
            System.out.println(" friday");

        } else if (n==6) {
            System.out.println(" sunday");

        } else if (n==7) {
            System.out.println(" pazar");

        }else {
            System.out.println(" salak öyle bir gün yok");
        }


    }
}
