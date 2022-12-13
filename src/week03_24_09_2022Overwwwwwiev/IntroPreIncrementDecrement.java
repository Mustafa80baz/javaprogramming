package week03_24_09_2022Overwwwwwiev;

public class IntroPreIncrementDecrement {
    public static void main(String[] args) {


    /*

        Task 2:  Create a class which is "IntroPreIncrementDecrement" define a variable,

          int a=5;
          print a;
          print the ++a;
          print the --a;
     */


    int a=5;

        System.out.println("a = " + a);
        System.out.println(++a);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(a);
        System.out.println("------------------------");

        int x=10;
        int number=x++  +100;//110
        System.out.println("number = " + number);//x=11 post ıncrement olduğu için

        //int x=11 preincrement den dolayı
        int number2=++x +100;//11+1+100=112 pre increment
        System.out.println("number 2 = " +number2);
    /*
    int x=10;

        int number=x++ + 100; //number
        System.out.println("number = " + number);

        int number2=++x +100;
        System.out.println("number2 = " + number2);
     */


    }
}
