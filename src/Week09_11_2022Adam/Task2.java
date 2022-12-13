package Week09_11_2022Adam;

public class Task2 {
    public static void main(String[] args) {
        /*
        Task 2 :   Write a method that can check if a number is prime or not
                Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1
         */
        boolean result=primeOrNot(6);
        System.out.println(result);

    }

    public static boolean primeOrNot(int number){
        boolean Isprime=true;

        for (int i = 2; i < number ; i++) {
            if (number%i==0){
                Isprime=false;
break;
            }

        }
        return Isprime;
    }

}
