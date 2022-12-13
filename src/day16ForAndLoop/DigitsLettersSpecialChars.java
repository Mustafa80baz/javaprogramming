package day16ForAndLoop;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str="Cydeo12345 School!@#$%WoodenSpoon";
        String digit="";// her bir yazılana bakıp harse lettere sayı ise digite değilse sepecile ekleyeceğiz
        String letters="";
        String special="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);// butun harfleri  sayıları ve diğer herseyi içeriyor
            System.out.println("ch = " + ch);//her şey tektek yazdırı
            if (ch>='0' && ch<='9'){
                digit +=ch;
            } else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                letters +=ch;
            }else {// yazı sayı day aharf değilse özel karakter yazdır
                if (ch != ' ');{//eger özel karakter boşluk dğilse diye yenı bir if actık onu da özele ekllemek için
                    special +=ch;
                }

            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digit = " + digit);
        System.out.println("special = " + special);
    }
}
