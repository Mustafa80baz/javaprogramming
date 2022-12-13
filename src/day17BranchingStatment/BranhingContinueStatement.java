package day17BranchingStatment;

public class BranhingContinueStatement {
    public static void main(String[] args) {
        for (char i = 'A'; i <='E' ; i++) {
            System.out.println(i);;
            if (i=='C'){
                continue;
            }
            System.out.println(i);
            System.out.println("--------------------------------");
            // print all even number1-10
            for (int j = 1; j <=11 ; j++) {
                System.out.println("j = " + j);



            }
        }
    }
}
