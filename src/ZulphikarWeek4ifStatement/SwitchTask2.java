package ZulphikarWeek4ifStatement;

public class SwitchTask2 {
    public static void main(String[] args) {
        /*
  use switch, provide order number, then print msg that calling by that order num
        example of integers
         */
       int ordernumber=1;

        switch(ordernumber){//break is mendatory but default is not
            case 1:
                System.out.println("you are the first");
                break;
            case 2:
                System.out.println("Wait please You are second");
                break;
            case 3:
                System.out.println("Be patient");
                break;
            default:
                System.out.println("in valid number go home");

    }
}
}