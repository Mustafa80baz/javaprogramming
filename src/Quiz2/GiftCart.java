package Quiz2;

import java.util.Scanner;

public class GiftCart {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String gift1= scan.nextLine();
        int money=23;
        String gift= "";
        if(money>=1 && money<=100){
            switch (money){
                case 1:
                    gift="Blanket";
                    break;
                case 2:
                    gift="Charger";
                case 3:
                    gift="Headsphones";

            }
        }
    }
}
