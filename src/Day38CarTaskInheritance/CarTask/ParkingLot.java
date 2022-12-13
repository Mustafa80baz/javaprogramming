package Day38CarTaskInheritance.CarTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota=new Toyota("Camry",2014,20000,"white",100);
        Tesla tesla =new Tesla("Model S",2019,35000,"White",1002);
        Bmw bmw=new Bmw("320",2020,40000,"Black",10);
       toyota.start();
       tesla.start();
       bmw.start();
    }

}
