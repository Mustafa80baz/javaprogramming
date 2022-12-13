package Day33StaticsAndMultiClasses;

public class Iphone {
    public static String brand="Apple";//Ifonu apple uretiyor değişmez
    public String model;//değişiyor onun için static değil
    public double price;//fiyat değişir
    public static String OS;
    public String color;
    public String size;
    public static String madeIn="China";
    public static boolean hasbattery=true;
    //eger  her bir kişi veya ürüne göre değişiyorsa  bunu ıntance yaparız ama herpsinde aynı is değişmiyorsa
    //static yaparoz. Iphonun işletim sistemi gib.Hepsinde aynı dolayısı ile static.renk i değiştiğinden onu sattic yapamayız

    public static void printModel(){
      //  System.out.println(model);//static metod da instance meteod yazdırılamaz
    }
         public void method1(){

        System.out.println(model+":"+price);
        System.out.println(OS);//statıc olmasına ragmen instance da yazdırır
    }
}
