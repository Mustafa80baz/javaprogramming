package Day30CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setInfo("Toyota","Camry","White",2021,35000);
        System.out.println(car1);

        Car car2=new Car();
        car2.setInfo("NMW","335is","Black",2022, 45000);
        System.out.println("car2 = " + car2);
        Car car3=new Car();
        car3.setInfo("Audi","A6","Grey",2022,50000);
        System.out.println("car3 = " + car3);
        //hepsini tek bir array de yazdırma
      //  Car [] cars={car1,car2,car3};olmuyor
        ArrayList<Car>carList=new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));//3 u birden ama ayrı parantezlerde yazdırdı
        System.out.println("carList = " + carList);
        for (Car each: carList) {//fiyat ve markaları bir arada görme
            System.out.println(each.brand+" : "+each.price);
            System.out.println("--------------------------------");
            /*1000 lerce car arasından filitreleme
            BMW :2005 2008 arası
            toyota :1995-1997
                         */
            carList.removeIf(p-> p.brand.equals("BMW") && p.year>=2005 && p.year<= 2008);
            carList.removeIf(p-> p.equals("Toyota") && p.year>=1995 && p.year<=1997);

        }


    }


}
