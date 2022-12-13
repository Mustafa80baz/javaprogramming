package Day35Encapsulation.Encapsulation.Taskssolution;

public class Carpet {
    private   double width;
    private double length;
    private double unitePrice;
    private boolean isPersian;

    public Carpet(double width, double length, double unitePrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
       setUnitePrice(unitePrice);
       setPersian(isPersian);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<0){
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<0){
            return;
        }
        this.length = length;
    }

    public double getUnitePrice() {
        return unitePrice;
    }
    public void setUnitePrice(double unitePrice) {
        if (unitePrice<0){
            return;
        }
        this.unitePrice = unitePrice;
    }
    public boolean isPersian() {
        return isPersian;
    }
    public void setPersian(boolean persian) {
        isPersian = persian;
    }
    public double calCost(){
        return (width+length)*unitePrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitePrice=" + unitePrice +
                ", isPersian=" + isPersian +
                ", total price of Carpet= $" + calCost() +
                '}';
    }
    public static void main(String[] args) {
        Carpet carpet1=new Carpet(6.2,4.5,50,true);
        System.out.println("carpet1 = " + carpet1);
    }



   /*
    3. Carpet Task
3.1create a class named Carpet:
private variables:width, length, unitPrice, isPersian (boolean)
Encapsulate all the fields:Conditions:
width can not be negative    length can not be negative   unit price can not be negative
Add a constructor to set all the instances
instance methods:
calcCost(): should be able to calculate the total
cost of the carpet and return it as double
toString(): should be able to display all the info
of the carpet including the total cost of the carpet as calculated by
calcCost()
total price of carpet = (width*length)*unitPrice
if the carpet is persian  carpet, add 200$ to the totalPrice
     */
}
