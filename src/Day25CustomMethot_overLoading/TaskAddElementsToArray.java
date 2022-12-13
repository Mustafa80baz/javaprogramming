package Day25CustomMethot_overLoading;

import java.util.Arrays;

public class TaskAddElementsToArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};//bize verilen array bunun içine bir tane daha ekleyeceğiz
      arr=  addInteger(arr,5);//asagıdakı add methodonu cagırıp yukarda velilen arr ve ekleyecegımızı içine yazdık, bunu tekrar kullanabilmek için
        //yeniden assing etmemiz gereke arr= çine hepsni atsın diye
        System.out.println(Arrays.toString(arr));
        int[] ar={4,5,6,7};
        ar=adddInteger(ar,8);
        System.out.println(Arrays.toString(ar));
    }
    public static int[] addInteger(int[] array,int element){
int[] result=new int[array.length+1];
int i=0;
        for (int each:array) {
            result[i++]=each;
        }
        result[i]=element;

   return result;
    }
    public static int[] adddInteger(int []array,int element){
        int[] result=new int[array.length+1];
        int i=0;
        for (int each:array) {
            result[i++]=each;


        }
        result[i]=element;
        return result;
    }
   // //5 nasıl eklenır {1,2,3,4,5,}
    /*
    1-create a return method callled addInteger that can add an Integer after the last indexof an Integer array
    2-create a return method callled adddouble that can add a Double after the last indexof an Integer array
    3-create a return method callled addString that can add a String after the last indexof an Integer array
    4-create a return method callled addchar that can add a char after the last indexof an Integer array
     */
}
