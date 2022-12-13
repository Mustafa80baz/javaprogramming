package week3_day07_Operators.ÖrnekUygumalarıfStatement;

public class NameOfTheMont {
    public static void main(String[] args) {

        int n=12;
        String month;
        if (n==1){
            month="ocak";
        } else if (n==2) {
            month="şubat";
        } else if (n==3) {
            month="Mart";
        } else if (n==4) {
            month="Nisan";
        } else if (n==5) {
            month="Mayıs";
        } else if (n==6) {
            month="Haziran";
        } else if (n==7) {
            month="Temmuz";
        } else if (n==8) {
            month="agustos";
        } else if (n==9) {
            month="Eylül";
        } else if (n==10) {
            month="Ekim";
        } else if(n==11) {
            month="\"KASIM\" SEVGİLİMİN DOĞDUĞU AY";
        }else {
            month="Aralık Bu garibin doğdugu ay";

        }
        System.out.println(month);
    }
}
