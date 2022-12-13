package Day38CarTaskInheritance.CarTask;

public class Car {
    public String brand,model;
    public int year;
    public double price;
    public String color;
    public int mies;


    public Car(String brand, String model, int year, double price, String color, int mies) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.mies = mies;
    }
    public void start(){
        System.out.println(brand+" "+"is starting");
    }
    public void drive(){
        System.out.println(brand+" "+" is driving");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", mies=" + mies +
                '}';
    }
}
