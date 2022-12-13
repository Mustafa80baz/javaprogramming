package week05_10_08_2022SwichScanner;

public class KucukBuyukHarfDuyarlılıgı {
    public static void main(String[] args) {
        // equal mı diye bakarken herşeye bakacagız.Büyük küçük hepsine

        String a="Word";// a ve b birbirine eşit değiller
        String b="word";

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));//buyuk kucukbakmaz ıgnore dedik


    }
}
