package Day13Practise1;

public class İlkVeSonHarfAynıMI {
    public static void main(String[] args) {
        String a="level";
        char ch1=a.charAt(0);
        System.out.println("ch1 = " + ch1);
        char ch2=a.charAt(a.length()-1);
        if (ch1==ch2){
            System.out.println("Same");
        }else {
            System.out.println("Not same");
        }
    }
}
