package day12SwichAndScanner;

public class deneme {
    public static void main(String[] args) {
int x= 10;
// pre increment first
        System.out.println(++x);//11
        System.out.println(x);//11
              System.out.println(x++);//11
        System.out.println(x);//11+1=12 post increment te önce bir üst satırda kini sonra kendi işlemnini yazdırır.
        System.out.println("-----------------------------");
        System.out.println(x++);//12
        System.out.println(x);//12+1=13
        System.out.println("-------------------------");
        System.out.println(--x);//12-1=11: predecrement hemen 1 eksilt
        System.out.println(x--);// post derement önce yukardaki satır sonucu neyse onu yani :12 yazırır
        System.out.println(x);//şimdi ise eksiltme işlemini yapar yanı: 12 -1=11

        int y=12;
        y=34;
    y+=100;

        System.out.println(y);
        System.out.println("------------------------");
        y=145;
    String sonuc;

        if (y>=0 && y<=100){
                if (y>=65){
                    System.out.println("geçti");
                } else   {

                    System.out.println("kaldı");
        }
        }else {

            System.out.println("ne len buuüü");

        }
        System.out.println("----------------");

       sonuc= (y>=60)?"geçti" : "kaldı";
    }
}
