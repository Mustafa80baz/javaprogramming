package Day20Array;

public class UniqueElementOfArray {
    public static void main(String[] args) {
     String []word={"Java" ,"Java","C#","python","python"};
        for (int j = 0; j < word.length ; j++) {
            String element=word[0];//[0]=ilk kelimeyi temsil eder
            int frequency=0;
            for (int i = 0; i < word.length; i++) {
                if (word[i].equals(element)){
                    frequency++;
                }

        }

            if (frequency==1){
                System.out.println("element = " + element);

        }

        }
    }
}
