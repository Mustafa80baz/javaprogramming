package Day35Encapsulation.Encapsulation.Taskssolution;

public class Item {
    private String name;
    private double unitePrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()||name.isBlank()){
            return;
        }else {

        }
        this.name = name;
    }

    public double getUnitePrice() {
        return unitePrice;
    }

    public void setUnitePrice(double unitePrice) {
        this.unitePrice = unitePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /*

4.1create a class called Item          private variables:            name, unitPrice, quantity
Encapsulate all the fields:Conditions:
name can not be empty or blank   name can not contain any special   characters other than space
name must start with letters  unit price can not be negative    quantity can not be negative
if the Item name is toilet paper
(case insensitive) then the quantity can not be more than 1
Add a constructor that allows user to set all the fields when
the object is created.
(If the arguments
not valid it should not be set to the instances)
instance methods:
calcCost(): returns the total cost
toString(): returns the name, unit price, quantity and
total cost info as calculated by calcCost()
     */
}
