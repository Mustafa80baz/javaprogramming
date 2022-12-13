package Day25CustomMethot_overLoading;

public class ToArray_OverLoading {
    public static void main(String[] args) {
   int sum= sumOnumbers(2,3);
        System.out.println("sum = " + sum);

double sum1=sumOnumbers(2.3,3.1);
        System.out.println("sum1 = " + sum1);
        int sum2=sumOfNumber(6,7,8);
        System.out.println("sum2 = " + sum2);

    }
     /*
    //create a function that can find sum two numbers

    //create a function that can find sum three numbers
    //create a function that can find sum four numbers

    */
     public  static int sumOnumbers(int num1,int num2){
         return num1+num2;
     }
    // public static int addElement(int num1,int num2,int num3){
      //   return num1+num2+num3;
     //}
    public static double sumOnumbers(double num1,double num2){
        return num1+num2;
    }

    public static int sumOfNumber(int num1,int num2,int num3){
        return num1+num2+num3;
    }



        }





