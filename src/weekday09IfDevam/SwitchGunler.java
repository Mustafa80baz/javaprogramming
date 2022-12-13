package weekday09IfDevam;

public class SwitchGunler {
    public static void main(String[] args) {// switch sadece sayıları karşılaştırıp yazdırmak için yazıda kullanılmaz boolean veya String de olmaz
      int number=8;
      String gun;
      switch (number){
          case 1:
              System.out.println("pazartesi");
              break;
          case 2:
              System.out.println("salı");
              break;
          case 3:
              System.out.println("carsamba");
              break;
          case 4:
              System.out.println("perşembe");
              break;
          case  5:
              System.out.println("CUMA");
              break;
          case 6:
              System.out.println("cumaertesi");
              break;
          case 7:
              System.out.println("tatil");
              break;
          default:

              System.out.println("yatıs");



      }

        System.out.println("------------------");


    }

}








