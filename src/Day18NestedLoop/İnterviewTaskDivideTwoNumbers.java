package Day18NestedLoop;

public class İnterviewTaskDivideTwoNumbers {
    public static void main(String[] args) {
        //Write a program that can divided two numbers withour using / and * eperators
        //örnek 20 yi 6  ya bölme ve carpma kullanmadan böl
         int a=20;
         int b=9;
         int count=0;
         while (a>=b){//denlem bozuluncaya
             a-=b;
             count ++;

         }
        System.out.println(count+" with the reminder "+a);
    }
}
