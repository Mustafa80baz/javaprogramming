package ZulphikarWeek6loopFor;

public class forEachLoop {
    public static void main(String[] args) {
        int [] num={1,2,3,4,5,6,7};
        for (int each : num) {
            System.out.println("each = " + each);

        }
        //create email list as @gmail.
        //{harold, jack,ahmet,sakushi


        String [] name={"Harold","Jack","Ahmet","Sakushi"};
        for (String each : name) {
            System.out.println( each+"@gmail.com");

        }
        //başka task
        String [] names = {"Harold8000", "Jack3000", "Ahmet6000", "Sakushi7000"};

        String number = "";
        for (String name1 : names) {
            number = name1.substring(name1.length()-4);
            int salary = Integer.valueOf(number);
            System.out.println(salary);
        }

    }

    }





