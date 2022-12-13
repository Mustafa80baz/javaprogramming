package Day25CustomMethot_overLoading;

public class Sumof4DoubleNumbers {
    public static void main(String[] args) {
        double sum=sumof4number(10.0,21.2,33.3,44.4);
        System.out.println("sum = " + sum);
        int sum1=sumOfNumber(1,2,3,4);
        System.out.println("sum1 = " + sum1);

    }

    public static double sumof4number(double num1,double num2,double num3,double num4){
        return num1+num2+num3+num4;
    }

    public static int sumOfNumber(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }
}

