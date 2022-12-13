package ZulphikarWeek4ifStatement;

public class SwitchTask {
    public static void main(String[] args) {

        String brand="";

        switch(brand){//break is mendatory but default is not
            case "Apple":
            System.out.println("buy an Ipohone");
            break;
            case "Samsung":
            System.out.println("buy a Samsung");
            break;
            case "Alcatel":
                System.out.println("buy an alcatel");
                break;
        default:
            System.out.println("not in stock");
    }
}
 }