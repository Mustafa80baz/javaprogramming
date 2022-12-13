package Day21ForEachLoop;

public class AvarageNumber {
    public static void main(String[] args) {

        int []numbers={10,50,4,20,10,0};
        double sum=0;
        for (int say : numbers) {
            sum+=say;
        }
double avarage=sum/ numbers.length;
        System.out.println("avarage = " + avarage);
    }
}
