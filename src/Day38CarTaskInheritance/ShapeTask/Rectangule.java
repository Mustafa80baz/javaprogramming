package Day38CarTaskInheritance.ShapeTask;

public class Rectangule extends Shape {
    private double length,width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0);{
            System.err.println("Invalid length");
            System.exit(1);
        }
        this.length=length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width<=0){
            System.out.println("Invalid width");
            System.exit(1);
        }
        this.width = width;
    }
    public Rectangule( double length, double width) {
        super("Rectangule");
        setLength(length);
       setWidth(width);
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangule{" +
                "length=" + length +
                ", width=" + width +
                ",area='" + area() + '\'' +
                ",perimater='" + perimeter() + '\'' +
                '}';
    }
}
