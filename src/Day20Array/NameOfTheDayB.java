package Day20Array;

public class NameOfTheDayB {
    public static void main(String[] args) {

        String []days={"Monday","Tuesday","Wednesday","Tursday","Friday","Saturday","Sunday"};
        //System.out.println(Arrays.toString(days));
        int num=1;
        if (num<1||num>7){
            System.err.println("invalid number");
            System.exit(0);
        }
        System.out.println(days[num-1]);
    }

}
