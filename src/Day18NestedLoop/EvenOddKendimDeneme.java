package Day18NestedLoop;

import java.util.Scanner;

public class EvenOddKendimDeneme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("bir sayı gir");
            int sa= scan.nextInt();
            if (sa%2==0){
                System.out.println("çift sayı");
            }else {
                System.out.println("Tek sayı");
            }
            System.out.println("devam etmek istermisin");
            String cv= scan.next().toLowerCase();
            while (!(cv.equals("yes")  || cv.equals("no"))){
                System.out.println("olmadı hacı abi bir daha denemek istermisin");
                scan.next().toLowerCase();
            }
          if (cv.equals("no")){
              break;
          }
            scan.close();
        }
    }
}
