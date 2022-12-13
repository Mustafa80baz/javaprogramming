package day08IfStatement;

public class EvenlyDivisible {

    public static void main(String[] args) {
        int num =100;

        boolean divisibleBy2 = num % 2==0;// if the reminder of number divided by 2 is ziro,then it's evenly divisible by 2
        boolean divisibleBy3=num % 3==0;
        boolean divisibleBy5=num%5==0;
        System.out.println(num+"is divisible by 2"+divisibleBy2);
        System.out.println(num+"is divisible by 3"+divisibleBy3);
        System.out.println(num + " is divisible by 5"+divisibleBy5);
        System.out.println("-------------------");

        int year=2000;
        boolean isLeapYear =year%4==0;
        System.out.println(year+" is Leap Year : " + isLeapYear);







    }
}
