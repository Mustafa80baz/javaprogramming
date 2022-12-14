package Day38CarTaskInheritance.ShapeTask;

import Day35Encapsulation.Encapsulation.Taskssolution.Rectangle;

public class ShapeObject {
    public static void main(String[] args) {
        Square square=new Square(10);
        square.setSide(20);
        System.out.println(square);
        System.out.println("---------------------");

    Rectangle rectangle=new Rectangle(45.3,4);
        System.out.println(rectangle);
                System.out.println("-----------------");
                rectangle.setLength(13);//uzunlugu degiştirdik
        System.out.println(rectangle.getLength());//deşimden sonra böyle yazdır
        System.out.println(rectangle);

        System.out.println("-------------------------------");

        Circle circle=new Circle(7.5);
        System.out.println(circle);
        System.out.println("--------------------------");
circle.setRadius(3.5);
        System.out.println(circle.getRadius());
        System.out.println(circle);
        System.out.println("----------------------");
        System.out.println(circle.getName());


    }
}
