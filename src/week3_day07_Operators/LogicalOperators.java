package week3_day07_Operators;

public class LogicalOperators {

    public static void main(String[] args) {

        //&& logical and %90 false cıkar sonuç

        boolean son1=10>5 && 10>7;
        System.out.println("son1 = " + son1);
        boolean son2 =20>10 && 20>110;
        System.out.println("son2 = " + son2);
        boolean son3 =30>50 && 30>10;
        System.out.println("son3 = " + son3);
        //|| or Logical

        boolean a=100==200 ||100!=300;
        System.out.println("a = " + a);
        boolean a1=100>900 ||1000<2000;
        System.out.println("a1 = " + a1);
        boolean a2 =100==100||100<90;
        System.out.println("a2 = " + a2);

        //!=logical not tersini yazdırıyor

        boolean son4=!true;
        boolean son5 =!false;
        System.out.println("son4 = " + son4);



    }
}
