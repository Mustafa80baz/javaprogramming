package Day25CustomMethot_overLoading;

import java.util.Arrays;

public class MedhotOverloodingIntro {
    public static void main(String[] args) {
        int []intArray={5,6,0,-1,3,4};
Arrays.sort(intArray);
        double[]doubleArray={10.5,11.5,5.5,4.5};
Arrays.sort(doubleArray);
        char []charArray={'E','F','B','D','A'};
        Arrays.sort(charArray);
        System.out.println("-------------------------------");
     double sum= sumOfNunber(1.2,2.1);
        System.out.println(sum);
        //10,20
        int sum1 =sumOfNumbers(10,20);
        System.out.println("sum1 = " + sum1);
    }


    public  static int sumOfNumbers(int num1,int num2){
        return num1+num2;
    }
    public static double sumOfNunber(double num1,double num2) {
    return num1+num2;
    }
    public static int sumOfNumbers(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public static double sumOfNunber(double num1,double num2,double num3) {
        return num1+num2+num3;
    }
    public static int sumOfNumbers(int num1,int num2,int num3,int num4){

        return num1+num2+num3+num4;//return sumofdouble(num+num2+num)+num4 de yapılabilir
    }

    public static double sumOfNunber(double num1,double num2,double num3,double num4,double num5){
        return num1+num2+num3+num4+num5;
    }
}

//eger metod name aynı ise int double fark etmez overlooding yapılabilir ancak parantez degerleri aynı olmayacak
// 2 si de num2 ye kadrasa olamz.Parantez içindekilerin sayısı farklı olacak