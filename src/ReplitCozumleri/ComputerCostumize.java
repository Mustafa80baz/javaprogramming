package ReplitCozumleri;

import java.util.Scanner;

public class ComputerCostumize {
    public static void main(String[] args) {

        double totalPrice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        System.out.println("Select CPU type:");
        scan.nextLine();
        String cpu = scan.nextLine();
        System.out.println("Select RAM size:");
        int ramSize = scan.nextInt();
        System.out.println("Select storage type:");
        String storageType = scan.next();
        System.out.println("Select storage size:");
        int storageSize = scan.nextInt(); //resolution
        System.out.println("Select screen resolution:");
        String screenResolution = scan.next();
        //WRITE YOUR CODE BELOW:
        if (screenSize == 13.3) {
            totalPrice += 200;
        } else if (screenSize == 15.0) {
            totalPrice += 300;
        } else if (screenSize == 17.3) {
            totalPrice += 400;
        }

        switch (cpu) {
            case "i3":
                totalPrice += 150;
                break;
            case "i5":
                totalPrice += 250;
                break;
            case "i7":
                totalPrice += 350;
                break;

        }

        totalPrice = totalPrice + (ramSize / 4) * 50;

        if (storageType.equals("HDD")) {
            totalPrice = totalPrice + (storageSize / 500) * 50;
        } else if (storageType.equals("SSD")) {
            totalPrice = totalPrice + (storageSize / 500) * 100;
        }

        if (screenResolution.equals("FULLHD")) {
            totalPrice += 100;
        } else if (screenResolution.equals("4K")) {
            totalPrice += 200;
        }
        totalPrice=(int) totalPrice;
        System.out.println("Final price is: $" + totalPrice);
    }
}
