package Day31Constructor;

import java.util.Arrays;

public class Rectangleobject {
    public static void main(String[] args) {
     Rectangle rectangle1 = new Rectangle(5.5,3.4);
     Rectangle rectangle2=new Rectangle(21.1,5.6);
     Rectangle rectangle3=new Rectangle(6.8,7.9);
        System.out.println("rectangle1 = " + rectangle1);
        System.out.println("rectangle2 = " + rectangle2);
        System.out.println("rectangle3 = " + rectangle3);

        Rectangle []rectangles={rectangle1,rectangle2,rectangle3};
        System.out.println(Arrays.toString(rectangles));
    }
}
