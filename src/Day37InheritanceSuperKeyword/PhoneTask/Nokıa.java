package Day37InheritanceSuperKeyword.PhoneTask;

public class Nokıa extends Phone {
    public Nokıa( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }
    public void selfDefence(){
        System.out.println("You can use "+brand+" "+model+" as self defence tool");
    }
}
