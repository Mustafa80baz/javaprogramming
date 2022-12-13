package Day31Constructor;

public class Pizza {
public char size;
public  int numberOfCheeseTopping,numberOfPeperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPeperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPeperoniTopping = numberOfPeperoniTopping;
    }
    public double doublecalCost(){
        double startingPrice=(size=='S')? 10:(size=='M')? 12:14;
        double totalprice=startingPrice+(numberOfCheeseTopping+numberOfPeperoniTopping)*2;
        return totalprice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPeperoniTopping=" + numberOfPeperoniTopping +
                ", totalPrice= $" + doublecalCost()+
                '}';
    }

}
