package day17BranchingStatment;

public class EvenandOddNUmber {
    public static void main(String[] args) {
        // print all even number1-10
        for (int i = 2; i <=10; i+=2) {// bir yolu bu
            System.out.println("i = " + i);
        }
        System.out.println("-------------------------");
        for (int i = 1; i <=11 ; i++) {//2. yolu cift sayılar
            if (i%2 !=0){//i nın 2 böolümunden kalan 0 değilse
                continue;//kalannı 0 olmayan sayıları atla//devam et demek
            }
            System.out.println("a ="+  i);
        }
//7tek sayılar   odd number

        for (int i = 0; i <=10 ; i++) {
            if (i%2==0){
                continue;
            }
            System.out.println("b = " + i);

        }

        }
}
