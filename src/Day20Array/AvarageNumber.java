package Day20Array;

public class AvarageNumber {
    public static void main(String[] args) {

        int number[]={10,20,30,40,50,60};
        double sum=0;// ortalamamlrını bulmak için önce toplamak lazım  10+20+30+...
        for (int i = 0; i < number.length ; i++) {
            sum+=number[i];
        }
        double AvarageNumber=sum/ number.length;
        System.out.println("AvarageNumber = " + AvarageNumber);
    }
}
