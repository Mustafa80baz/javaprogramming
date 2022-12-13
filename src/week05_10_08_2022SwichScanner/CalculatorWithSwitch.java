package week05_10_08_2022SwichScanner;

import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        //soru=İnterfwiev what do you know about scanner
        // Answer =in order to get input from user
        //2. what is the diiference next and thenextline
        // answer= to gert string from user  '2-with nexlıne  to get next input from user to use
// yukardakiler interwiev sorusu
//swich kullanarak calculator yapacağiz
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter first number");
         double number1=scan.nextDouble();
        System.out.println("Please enter second number");
        double number2= scan.nextDouble();
        System.out.println("Please enter your operator");
       char operator= scan.next().charAt(0);
// we dont have next nextchar() method so we need to use our String method which is charAt(0)
        double result=0;

        switch (operator){
            case '+':
                result=number1+number2;
                break;
            case '-':
                result=number1-number2;
                break;
            case '*':
                result=number1*number2;
                break;
            case '/':
                result=number1/number2;
                break;

        }
        System.out.println(result);
        // how we can create String in java mülakat sorusu
        //String is a class we caan oluşturabilir 2 yolla
        //NEw keyword la String arasında ne fark var?
        //in wich part of memeory we store string ?in the satck  we store verialble
    }
}
