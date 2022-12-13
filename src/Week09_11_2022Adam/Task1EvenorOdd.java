package Week09_11_2022Adam;

public class Task1EvenorOdd {
    public static void main(String[] args) {

oddOrEven(3);

    }
// Task 1 :   Write a method that can check if a number is even or odd
    public static int oddOrEven(int num1){
        if (num1%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("odd number");
        }

        return num1;
    }
}
