package weekday09IfDevam;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an int7" +
                "eger:");
       int num1= input.nextInt();

       System.out.println("enter a decimal number:");

        double num2= input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("multiplication:"+(num1*num2));

        input.close();//scanneri kapatır
        System.out.println("enter a gender");
        int num3= input.nextInt();
        System.out.println(num3);





    }

}
