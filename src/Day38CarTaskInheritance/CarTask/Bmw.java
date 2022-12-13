package Day38CarTaskInheritance.CarTask;

public class Bmw extends Car{
    public Bmw( String model, int year, double price, String color, int mies) {
        super("BMW", model, year, price, color, mies);
    }
    public void breaksDown(){
        System.out.println(brand+" "+model+" is breaking");
    }
    public void racing(){
        System.out.println(brand+" "+model+" is racing");
    }

    public void start(){
        System.out.println("Call mechanic to jump start"+ brand+" "+ model);

    }
}
