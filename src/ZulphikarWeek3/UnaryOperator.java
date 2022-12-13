package ZulphikarWeek3;

public class UnaryOperator {
    public static void main(String[] args) {

        int a1=7*3+24/3-5;
        // önce 7*3 + 24/3  -5
        int b2=(7*3)+(24/3)-5;
        System.out.println("-----");
        int x=20;
        int y=10;
        double z=  x++ -  y*7/y-- +  x*10;
        //      x=20  -  70*10   +210
        //      13        210        =223
        System.out.println(z);






    }
}
