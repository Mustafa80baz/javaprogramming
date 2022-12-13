package Day13Practise1;
import java.util.Scanner;
public class KelimedenİkiHarfyazdırma {
    public static void main(String[] args) {
        String str="Wooden";
        String last="Spoon";
        char ilk=str.charAt(0);
        System.out.println("ilk = " + ilk);
        char sec=last.charAt(0);
        System.out.println("sec = " + sec);
        System.out.println(ilk+"."+sec);


    }

    public static class contains2 {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
                    String word1=s.nextLine();
            String word2=s.nextLine();

            word1.equals(word2);
            System.out.println(word1.equals(word2));

        }
    }
}
