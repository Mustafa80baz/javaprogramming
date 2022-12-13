package Day21ForEachLoop;

public class MaximumnNumberForEachile {
    public static void main(String[] args) {
        int []numbers={10,50,4,20,10,0};
        int max=numbers[0];
        int min=numbers[0];
        /*
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }

        }
        System.out.println(max);
                 */
        for (int number : numbers) {
            if (number>max){
                max=number;
            }
        }
        System.out.println(max);


        }
    }

