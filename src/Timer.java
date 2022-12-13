import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException{

       Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number of minutes");
        int minutes= scan.nextInt();
        scan.close();
        for (int i = minutes; i >0 ; i--) {
            for (int j = 59; j >=0 ; j--) {
                System.out.println("\r"+(i-1)+"minutes and"+j+"second left");
                Thread.sleep(1000);;

            }

        }
        System.out.println("\n\n");

        System.out.println("\t\t\t***************************************");
        System.out.println("\t\t\t*                                     *");
        System.out.println("\t\t\t*  Time is up,Please take your seat   *");
        System.out.println("\t\t\t*                                     *");
        System.out.println("\t\t\t***************************************");


}
}
