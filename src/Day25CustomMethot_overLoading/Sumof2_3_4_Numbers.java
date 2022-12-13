package Day25CustomMethot_overLoading;

public class Sumof2_3_4_Numbers {
    public static void main(String[] args) {
      int sum1=  sumOf2Numbers(10,20);
        System.out.println(sum1);
        int sum2=sumOf3Numbers(10,20,30);
        System.out.println("sum2 = " + sum2);
        int sum3=sumOf4Numbers(10,20,30,40);
        System.out.println("sum3 = " + sum3);
    }
    public  static int sumOf2Numbers(int num1,int num2){
        return num1+num2;
    }
    public static int sumOf3Numbers(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public static int sumOf4Numbers(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }
}
   /*
    //create a function that can find sum two numbers
   //create a function that can find sum three numbers
    //create a function that can find sum four numbers

    */

