package Day35Encapsulation.Encapsulation.Taskssolution;

public class Square {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            return;
        }
        this.side = side;
    }
    public double calArea(){
        return side*side;
    }
    public double calPrimetere(){
        return 4*side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + calArea() +
                "perimeter=" + calPrimetere() +
                '}';
    }
}


