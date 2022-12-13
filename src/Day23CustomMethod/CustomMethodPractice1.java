package Day23CustomMethod;

public class CustomMethodPractice1 {
    public static void main(String[] args) {
        helloworld5times();
        helloCydeo5times();
        selmolsun3times();
        evennumber();
    }
    //create a function than can print hello world 5 times
    public static void helloworld5times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");

        }
    }
    //create a function than can print hello Cydeo 5 times
    public static void helloCydeo5times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Yetr len yeter");
        }

    }
    public static void selmolsun3times(){
        for (int i = 0; i <3 ; i++) {
            System.out.println("Selam olsun");

        }
    }

        //even number 1 to 10
    public static void evennumber(){
        for (int i = 2; i <11 ; i+=2) {
            System.out.print(i+" ");

        }
    }

}
