package Utilities;

import java.util.Arrays;

public class ArraysUtility {
    //print each integer of an integerarray in separate lines
    public static void printElement(int []array){
        for (int each : array) {
            System.out.println(each);
        }
    }
    
    //each double number yazdırma
    public static void printElement(double []array){
        for (double each : array) {
            System.out.println(each);
        }
}
    //each char number yazdırma
    public static void printElement(char []array){
        for (char each : array) {
            System.out.println(each);
        }
    }
    //each String number yazdırma
    public static void printElement(String []array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    //return teh max number for integer array
    public static int max(int[] numbers){//arrayın içindeki son elenemti bulma
      Arrays.sort(numbers);//sıraya koyduğumuzda buyuk sonuncu olacak
      return numbers[numbers.length-1];//burada da sonuncuyu bulaca
    }

//double arary arasında buyuk olanı yazdır
    public static double max(double[] numbers){//arrayın içindeki son elenemti bulma
        Arrays.sort(numbers);//sıraya koyduğumuzda buyuk sonuncu olacak
        return numbers[numbers.length-1];//burada da sonuncuyu bulaca
    }

    //find the minimal number in array
    public  static int minnumber(int[] number){
        Arrays.sort(number);
     return number[0];


    }
//minmum double u bul
    public  static double minnumber(double[] number){
        Arrays.sort(number);
        return number[0];

    }

    //check if the given integer element contained in given array .Returns boolean
    public static boolean contains(int []array,int element){
        //{1,2,3,4}  6 da içinde var mı
        boolean result=false;
        for (int each:array) {
            if (each==element){
                result=true;
            }

        }
        return result;
    }
    //check if the given double element contained in given array .Returns boolean
    public static boolean contains(double []array,double element){
        //{1,2,3,4}  6 da içinde var mı
        boolean result=false;
        for (double each:array) {
            if (each==element){
                result=true;
            }

        }
        return result;
    }
    //check if the given char element contained in given array .Returns boolean
    public static boolean contains(char []array,char element){
        //{1,2,3,4}  6 da içinde var mı
        boolean result=false;
        for (char each:array) {
            if (each==element){//if true it means element is in char aaray
                result=true;
            }

        }
        return result;
    }//10.metod

    //check if the givenStr,ng element contained in given array .Returns boolean
    public static boolean contains(String []array,String element){
        //{1,2,3,4}  6 da içinde var mı
        boolean result=false;
        for (String each:array) {
            if (each.equals("")){
                result=true;
            }

        }
        return result;
    }
//adds the given element to array ,returns a new array
    public static int[]addelement(int[] array,int element){
        int [] result=new int[array.length+1];
        int i=0;
        for (int each : array) {
            result[i++]=each;

        }
        result[i]=element;
        return result;
    }
    //adds the given element to array ,returns a new array
    public static double[]addelement(double []array,double element){
        double [] result=new double[array.length+1];
        int i=0;
        for (double each : array) {
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }
//adds the given element to array ,returns a new array
    public static String[]addelement(String[] array,String element){
        String[] result=new String[array.length+1];
        int i=0;
        for (String each : array) {
            result [i++]=each;

        }
        result[i]=element;
        return result;


    }
//adds the given element to array ,returns a new array
    public static char[] addelement(char[] array,char element){
        char [] result=new char[array.length +1];
        int i=0;
        for (char each : array) {
            result[i++]=each;
        }
        result[i]=element;
        return result;

    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int []array,int element){
        int count=0;
        for (int each : array) {
            if (each==element){
                count++;
            }

        }
        return count;

    }
    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double []array,double element){
        int count=0;
        for (double each : array) {
            if (each==element){
                count++;
            }

        }
        return count;

    }
    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char []array,char element){
        int count=0;
        for (char each : array) {
            if (each==element){
                count++;
            }

        }
        return count;
    }
    //returns the frequency of the given element from the given array

    public static int frequencyOfElement(String []array,String element){
        int count=0;
        for (String each : array) {
            if (each.equals(element)){
                count++;
            }

        }
        return count;

    }

    public static int[]uniqueElement(int []array){
        int []result={};
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){//unique olanı bulur
                result=ArraysUtility.addelement(result,each);//bunu result arrayaın içine yazar
            }

        }
        return result;
    }//20.metod
    //Returns the unique element from the given array
    public static double[]uniqueElement(double []array){
        double []result={};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){//unique olanı bulur
                result=ArraysUtility.addelement(result,each);//bunu result arrayaın içine yazar
            }

        }
        return result;
    }
    //Returns the unique element from the given array
    public static char[]uniqueElement(char []array){
        char []result={};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){//unique olanı bulur
                result=ArraysUtility.addelement(result,each);//bunu result arrayaın içine yazar
            }

        }
        return result;
    }
    //Returns the unique element from the given array
    public static String[]uniqueElement(String []array){
        String []result={};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){//unique olanı bulur
                result=ArraysUtility.addelement(result,each);//bunu result arrayaın içine yazar
            }

        }
        return result;
    }

    public  static int[]removeElement(int []array,int index){
        int[] result=new int[array.length-1];
        int j=0;
        for (int each : array) {
            if (each==array[index]){
                continue;
            }
            result[j++] =each;
        }
        return result;
    }
    public  static double[]removeElement(double []array,int index){
        double[] result=new double[array.length-1];
        int j=0;
        for (double each : array) {
            if (each==array[index]){
                continue;
            }
            result[j++] =each;
        }
        return result;
    }
    public  static char[]removeElement(char []array,int index){
        char[] result=new char[array.length-1];
        int j=0;
        for (char each : array) {
            if (each==array[index]){
                continue;
            }
            result[j++] =each;
        }
        return result;
    }
//remove String element from given array
    public  static String[]removeElement(String []array,int index){
        String[] result=new String[array.length-1];
        int j=0;
        for (String each : array) {
            if (each==array[index]){
                continue;
            }
            result[j++] =each;
        }
        return result;
    }

    public static int[] merge(int[] array1,int[] array2){
        //  int[] result=new int[array1.length+ array2.length]; bunun yerine
        int[] result={};
        for (int each : array1) {
           result= addelement(result,each);
        }
        for (int each : array2) {
            addelement(result,each);

        }
return result;
        }

    public static int[] merge2(int[] array1,int[] array2){
        int []result={};

        for (int each : array1) {
            result= ArraysUtility.addelement(result,each);

        }
        for (int each : array2) {
            result= ArraysUtility.addelement(result,each);

        }
        return result;
    }

    public static double[] merge(double[] array1,double[] array2){
        double []result={};

        for (double each : array1) {
            result= ArraysUtility.addelement(result,each);

        }
        for (double each : array2) {
            result= ArraysUtility.addelement(result,each);

        }
        return result;
    }

    public static char[] merge(char[] array1,char[] array2){
        char []result={};

        for (char each : array1) {
            result= ArraysUtility.addelement(result,each);

        }
        for (char each : array2) {
            result= ArraysUtility.addelement(result,each);

        }
        return result;
    }


    public static String[] merge(String[] array1,String[] array2){
        String []result={};

        for (String each : array1) {
            result= ArraysUtility.addelement(result,each);

        }
        for (String each : array2) {
            result= ArraysUtility.addelement(result,each);

        }
        return result;
    }

    //     replac the element of the array at given index with the new element
    public static int[] replace(int []array,int index,int newElement){
        if (index<0 ||index> array.length-1){
            System.err.println("invalid number");
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }
    //     replac the element of the array at given index with the new element
    public static double[] replace(double []array,int index,double newElement){
        if (index<0 ||index> array.length-1){
            System.err.println("invalid number");
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }
    //     replac the element of the array at given index with the new element
    public static char[] replace(char []array,int index,char newElement){
        if (index<0 ||index> array.length-1){
            System.err.println("invalid number");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }
    // replac the element of the array at given index with the new element
    public static String[] replace(String []array,int index,String newElement){
        if (index<0 ||index> array.length-1){
            System.err.println("invalid number");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    //Replace all element index element with the given element
    public static int[] replaceAll(int [] array,int oldValue,int newValue){

        for (int j = 0; j < array.length; j++) {
            if (array[j]==oldValue){
                array[j]=newValue;
            }

        }
        return array;



    }
    //Replace all element index element with the given element
    public static double[] replaceAll(double [] array,double oldValue,double newValue){

        for (int j = 0; j < array.length; j++) {
            if (array[j]==oldValue){
                array[j]=newValue;
            }

        }
        return array;

    }
    //Replace all element index element with the given element
    public static char[] replaceAll(char [] array,char oldValue,char newValue){

        for (int j = 0; j < array.length; j++) {
            if (array[j]==oldValue){
                array[j]=newValue;
            }

        }
        return array;

    }
    //Replace all element index element with the given element
    public static String[] replaceAll(String [] array,String oldValue,String newValue){

        for (int j = 0; j < array.length; j++) {
            if (array[j].equals(oldValue)){
                array[j]=newValue;
            }

        }
        return array;

    }

    public static int[] removeDuplicate(int []array){
        int []result={};
        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addelement(result,each);
            }

        }
        return result;
    }

    public static double[] removeDuplicate(double []array){
        double []result={};
        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addelement(result,each);
            }

        }
        return result;
    }
    public static char[] removeDuplicate(char []array){
        char []result={};
        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addelement(result,each);
            }

        }
        return result;
    }

    public static String[] removeDuplicate(String []array){
        String []result={};
        for (String each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addelement(result,each);
            }

        }
        return result;
    }


}
