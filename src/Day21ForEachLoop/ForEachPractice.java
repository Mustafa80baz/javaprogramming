package Day21ForEachLoop;

public class ForEachPractice {
    public static void main(String[] args) {
        //Her cümlenin baş  ve son harlerini harflerini yazdıracagız
        String []word={"Java Programming","Cydeı School","Wooden Spoon","Early Birds","Angry Birds"};
        for (String each : word) {
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));


        }


    }
}
