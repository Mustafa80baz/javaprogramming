package Day37InheritanceSuperKeyword.PhoneTask;

public class Phone {//Parent Class only contains the commen features

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery=true;//%100 eminsek doğru yada yanlışlıgından
    // direk burad a birden    // fazala setp gerekse ayrıca ststic blokla yaz

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
public void call( long phoneNumber){
    System.out.println(brand +" "+model+" is calling"+phoneNumber);
}
public void text(long phoneNumber){
    System.out.println(brand+" "+model+" is texting"+phoneNumber);
}

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }
}
