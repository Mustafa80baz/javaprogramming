package week3_day07_Operators;

public class incremantAndDecrementOparaters {

    public static void main(String[] args) {
        /*

        pre increment (++): değeri +1 artırır.to increse the value
        pre decrement :değeri -1 düşürür
         */
int a=5;
 int b=17;

        System.out.println(++a);//1
        System.out.println(--b);//2
        System.out.println(b);//3
        System.out.println("------------------------------------");
// buraya kadar pre increment/decrement,


// post increment: daha önce 1 artırılan veya eksiltileni eski haliyle yazardırır
        //örenek;

             int h=100;
        System.out.println(h);
        System.out.println(h++);//2 basamaklı önce ilk haline getiriyor sonra tekrar 1 artırıyor,
        System.out.println(h);

        System.out.println("-------------------------------------");

                  //post decrment örnekler

           int q=30;

            System.out.println(--q); //29
            System.out.println(q--); //29,28
           //28
             System.out.println(q);

    }

    public static class ShortHandOperators {

        public static void main(String[] args) {

            //assignment:= atama en son numara karşisına kacı atamışsan onu esas alıyor. 12 . sıra numarayı 200 olarak
            // olarak tanımladık artık numara yazdır dediğimiz de hep 200 yazdıracak

            int number=100;
            System.out.println("number "+number);

            number=200;
            System.out.println("number ="+number);
         String word="mehaba";
            System.out.println(word);

            word="selam";
            System.out.println(word);
            System.out.println("---------------------------------------------");

                    //additional operator x+=y

            int x =100;
            System.out.println("r"+ x);
            System.out.println(x+200);//300
            //x=x+200

            x+=200;
            System.out.println("x ="+x);

            String w="Wooden  Spoon";
            System.out.println(w);

            w="oak white";
            System.out.println("w = "+ w);

            double num1=2.5;
            System.out.println("num1 "+num1);//2.5
            num1+=5.5;// num1 den + koyunca ilk (2.5) ile ikinci tanımlanan(5.5) i topluyor.sonucu yazıyor :8.0
            System.out.println("num1 "+ num1);


            double availablebalance=1000.50;

            //deposite:300
            availablebalance+=300;
            System.out.println("availablebalance ="+availablebalance);

            //500 dolar ceçersek ne olur
            availablebalance-=500;
            System.out.println("availablebalance ="+availablebalance);

            // widhdrawing 200$ then deposite 400$

            availablebalance-=200;//600.50
            availablebalance+=400;//100.50 sonuç her seferinde yeniden tanımala yapacakssın

            System.out.println("availabale balance ="+availablebalance);
            System.out.println("-----------------------------------");

            double  num2=25000;

            //num2=num2/2;
            num2 /=2;
            System.out.println(num2);

            //reminder assingment//%

            double num3=100;
            num3 %=3;
            System.out.println("num3 ="+num3);
            System.out.println("------------------");

            int amount =127;//cents
            int quoaters =127/25;
            int cents =amount%25;
            System.out.println("quartes ="+quoaters);

            int x1=300;

            x1 %=16;
            System.out.println("x1=" +x1);

    int balance =3500;
    //insurance fee:153

           balance%=153;

           System.out.println("balance ="+ balance);


















        }
    }
}
