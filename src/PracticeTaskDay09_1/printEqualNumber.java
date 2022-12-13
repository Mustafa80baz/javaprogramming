package PracticeTaskDay09_1;

public class printEqualNumber {
    public static void main(String[] args) {
        int a=12;  int b=18;  int c=22;



        if (a==b && a!=c && b!=c){
            System.out.println("a "+" &"+" b ="+" are equal");
        } else if (a==c && a!=b && b!=c) {
            System.out.println("a "+"& "+"c ="+" are equal");

        } else if (b==c && b!=a && c!=a) {
            System.out.println("b & c are equal");

        } else if (a==b&& b==c && a==c) {
            System.out.println("all equal");

        }else {
            System.out.println("Non of them equal");
        }

    }
}
