package Day25CustomMethot_overLoading;

import java.util.Arrays;

public class AddElementArrayUygulama {
    public static void main(String[] args) {
        /*
  1-crate a return method called addInteger that can add an Integer after the last indexof an integer array
  {1,2,3,4}+5 ekleyeceğiz içeri
  2-crate a return method called addDouble that can add a Double after the last indexof an integer array
  3-crate a return method called addString that can add a String  after the last indexof an integer array
  4-crate a return method called addchar that can add a char after the last indexof an integer array
         */
        int[] arr={1,2,3,4};
        arr=addInteger(arr,5);
        System.out.println(Arrays.toString(arr));

        double [] decimels={1.2,2.2,3.3,4.4};
         decimels= addDouble(decimels,5.5);
        System.out.println(Arrays.toString(decimels));
        String [] names={"Ali","Veli","Nihal","Salih"};
       names= addString(names,"Numan");
        System.out.println(Arrays.toString(names));
        char [] ch={'A','B','C','G'};
        ch=addchar(ch,'K');
        System.out.println(Arrays.toString(ch));
    }
    //
public static int[]addInteger(int[] array,int element){
        int [] result=new int[array.length+1];
        int i=0;
    for (int each : array) {
        result[i++]=each;

    }
result[i]=element;
 return result;
}
public static double[]addDouble(double []array,double element){
        double [] result=new double[array.length+1];
        int i=0;
    for (double each : array) {
        result[i++]=each;
    }
        result[i]=element;
    return result;
}

public static String[]addString(String[] array,String element){
        String[] result=new String[array.length+1];
        int i=0;
    for (String each : array) {
        result [i++]=each;

    }
        result[i]=element;
    return result;


}

public static char[] addchar(char[] array,char element){
        char [] result=new char[array.length +1];
        int i=0;
    for (char each : array) {
        result[i++]=each;
    }
    result[i]=element;
    return result;

}


}
