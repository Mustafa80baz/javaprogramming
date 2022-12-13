package Day38CarTaskInheritance.CarTask;

public class Tesla extends Car {
    public Tesla( String model, int year, double price, String color, int mies) {
        super("Tesla", model, year, price, color, mies);
    }
    public void autoDrive(){
        System.out.println(brand+" "+model+" in outopilot  mode");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\""+brand+" "+model);
    }
}
