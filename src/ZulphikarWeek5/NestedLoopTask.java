package ZulphikarWeek5;

public class NestedLoopTask {
    public static void main(String[] args) {
one();

    }
    //multiplication table
    public static void one(){
        for (int i = 1; i <=10 ; i++) {//1X1=1  birinci 1 birinci loop dan
            for (int j = 1; j <=10 ; j++) {
                System.out.println(j +"x"+i +"="+i);
            }
        }

    }
}
