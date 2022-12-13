package Day25CustomMethot_overLoading;

import java.util.Arrays;

public class AddElementsMethod_Overloading {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6};//7 ekle
        char [] ch={'A','B','C','D'};//'E'
        String []names={"Tatiana","Olexsadr","Ali","Veli"};//"Layan
        numbers=addelement(numbers,7);
        addelement(ch,'E');
        addelement(names,"Layan");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(names));
    }



    public static int[]addelement(int[] array,int element){
        int [] result=new int[array.length+1];
        int i=0;
        for (int each : array) {
            result[i++]=each;

        }
        result[i]=element;
        return result;
    }
    public static double[]addelement(double []array,double element){
        double [] result=new double[array.length+1];
        int i=0;
        for (double each : array) {
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }

    public static String[]addelement(String[] array,String element){
        String[] result=new String[array.length+1];
        int i=0;
        for (String each : array) {
            result [i++]=each;

        }
        result[i]=element;
        return result;


    }

    public static char[] addelement(char[] array,char element){
        char [] result=new char[array.length +1];
        int i=0;
        for (char each : array) {
            result[i++]=each;
        }
        result[i]=element;
        return result;

    }
}


