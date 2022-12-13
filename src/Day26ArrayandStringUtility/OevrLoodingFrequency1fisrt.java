package Day26ArrayandStringUtility;

public class OevrLoodingFrequency1fisrt {
    public static void main(String[] args) {
        int [] arr={1,1,1,2,2,3,3,4,5,6,7,7,7,1,1,1};
        int arra1=frequencyOfElement(arr,1);
        System.out.println(arra1);
    }
    //1,1,1,2,3,4,5 retuns the given element from given array
    public static int frequencyOfElement(int []array,int element){
        int count=0;
        for (int each : array) {
            if (each==element){
                count++;
            }

        }
return count;

    }

    public static int frequencyOfElement(double []array,double element){
        int count=0;
        for (double each : array) {
            if (each==element){
                count++;
            }

        }
        return count;

    }
    public static int frequencyOfElement(char []array,char element){
        int count=0;
        for (char each : array) {
            if (each==element){
                count++;
            }

        }
      return count;
    }

    public static int frequencyOfElement(String []array,String element){
        int count=0;
        for (String each : array) {
            if (each.equals(element)){
                count++;
            }

        }
        return count;

    }
}
/*
Create a class named FruquencyOfElement:
1-Create a method taht passes two parameters:an integer array and an Integer element
2-Create a method taht passes two parameters:a double array and a double element
1-Create a method taht passes two parameters:a char  array and a char element
1-Create a method taht passes two parameters:a String array and a String element
 */