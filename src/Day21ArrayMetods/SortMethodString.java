package Day21ArrayMetods;

import java.util.Arrays;

public class SortMethodString {
    public static void main(String[] args) {
        String[] names={"Ahmet","Gunay","Maria","Zuhal","Sinem","Anna"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));//harf sırasına göre yazdırır

        System.out.println("-------küçük buyuk harf karısıksa-----");

        String []adlar={"ANNA","ahmet","abi","Nihal","SALİH","numan"};
        Arrays.sort(adlar);
        System.out.println(Arrays.toString(adlar));

    }
}
