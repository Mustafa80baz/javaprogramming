package Day35Encapsulation.Encapsulation.Taskssolution;

public class Rectangle {
    private double width;
    private  double length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
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

    public double calArea(){
        return width*length;
    }
    public double calPerimeter(){
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calArea() +
                ", perimeter=" + calPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(5.4,7.8);
        System.out.println("rectangle1 = " + rectangle1);
    }





    /*
    Private variables:
Encapsulate all the fields Conditions:
width of the rectangle should not be negative
length of the rectangle should not be negative
Add a constructor that allows user to
set all the fields when the object is created.
(If the arguments
not valid it should not be set to the instances)
Methods:
calcArea(): returns the area of rectangle
calcPerimeter(): returns the perimeter of rectangle
toString(): can display the
width, length, area, and perimeter of rectangle when object is passed in
print statement
     */
}
