package Day32ConstructorOverLoading;

public class CarObjects {
    public static void main(String[] args) {

        Car car1=new Car("Toyata","Coralla",2020,4500);

    Car car2=new Car("Honda","Accord");
    Car car3=new Car("Lexus","RXS2w",2023);
    Car car4=new Car("Audı","A5",2023,35000,"white");
        Car car5=new Car("BMV","x5",2023,56000,"Black");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("car3 = " + car3);
        System.out.println("car4 = " + car4);
        System.out.println("car5 = " + car5);

}
}
