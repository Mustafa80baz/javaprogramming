package ReplitCozumleri;

import java.util.Scanner;

public class inhabitantsPandamic {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int inhabitant= scan.nextInt();
        int day=0;
while (inhabitant>0){
    System.out.println("Day"+day+++"["+inhabitant+"]");
    inhabitant =inhabitant/2;

}
        System.out.println("----EXTINCT----");



    }
}
