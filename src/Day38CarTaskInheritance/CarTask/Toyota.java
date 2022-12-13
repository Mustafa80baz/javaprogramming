package Day38CarTaskInheritance.CarTask;

public class Toyota extends Car{
    public Toyota(String model, int year, double price, String color, int mies) {
        super("Toyota", model, year, price, color, mies);
    }
    public void relible(){
        System.out.println(brand+" "+model+"is reliable");

    }
@Override //bu erro veriyorsa over ride olmaz
  public   void start(){
      System.out.println("Twist the key to ignition to start "+brand+" "+model);

    }
}
