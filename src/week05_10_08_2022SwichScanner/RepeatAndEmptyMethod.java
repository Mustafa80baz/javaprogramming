package week05_10_08_2022SwichScanner;

public class RepeatAndEmptyMethod {
    public static void main(String[] args) {

        String a="Hello \n\t\t";
        String cd=a.repeat(3);
        System.out.println(cd);
        System.out.println("--------------");
        String empty="";//bu empty
        String empty1=" ";// araya boşluk koyduğumuzda boş deildir.
        System.out.println("--------------------");
        // blank mı değil mi öğrenmek için isBlank  metodu kullanıacagız
        String blank="  ";  //checking space cevabı true dur
        System.out.println(blank.isBlank());
        System.out.println();



    }
}
