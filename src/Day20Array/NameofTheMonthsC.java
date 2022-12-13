package Day20Array;

import java.util.Arrays;

public class NameofTheMonthsC {
    public static void main(String[] args) {

      String[]month={"Janu","Febr","March","april","may","jun","july","august","Sempte","October","Novwem","December"};
        System.out.println(Arrays.toString(month));
        int num=15;
        if (num<1||num>12){
            System.err.println("invalit number");
            System.exit(0);

        }
        System.out.println(month[num-1]);
    }
}
