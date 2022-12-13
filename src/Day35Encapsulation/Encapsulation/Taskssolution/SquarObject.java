package Day35Encapsulation.Encapsulation.Taskssolution;

public class SquarObject {
    public static void main(String[] args) {

        Square square1= new Square(4);

        square1.setSide(3);
        System.out.println("square1.getSide() = " + square1.getSide());
        System.out.println(square1 );
    }
}
