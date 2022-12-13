package Day25CustomMethot_overLoading;

import java.util.Arrays;

public class AddElementToİntDoubleStringCharCArray {
    public static void main(String[] args) {
        double [] arr2={1,2,2.5,3.5,4.5};
        arr2=addDouble(arr2,5.5);
        System.out.println(Arrays.toString(arr2));
        double [] arra={1.2,2.2,3.3,4.4};
        arra=addDouble(arra,5.6);
        System.out.println(Arrays.toString(arra));
        int [] arary={2,3,4,5,6,7};
      arary = addInteger(arary,8);
        System.out.println(Arrays.toString(arary));
        String []names={"Tatiana","Olexsadr","Ali","Veli"};//cemil ekleyecegğiz
      names=  addString(names,"neira");
        System.out.println(Arrays.toString( names));
        char [] ch={'A','B','C','G'};
    }



    public static double []addDouble(double[] array,double element){
        double [] result=new double[array.length+1];
       int i=0;
        for (double each:array ) {
            result[i++]=each;

        }
      result[i] =element;
        return result;
    }

   public static double[] addDoubl(double [] array,double element){
        double []result=new double[array.length+1];
        int i=0;
       for (double each:array) {
           result[i++]=each;

       }
        result[i]=element;
       return result;
    }
    public static int[]addInteger(int []array,int element){
        int[] result=new int[array.length+1];
         int i=0;
        for (int each:array) {
            result[i++]=each;

        }
        result[i]=element;
        return result;
    }

    public static String[] addString(String [] array,String element){
        String []result=new String[array.length+1];
        int i=0;
        for (String each:array) {
            result[i++]=each;

        }
        result[i]=element;
        return result;
}
}