package Day20Array;

import java.util.Arrays;

public class NameOfTheSingleDiemnsionalBaşlangıcA {
    public static void main(String[] args) {
    //Array special type of variable,,array is a data structure to use dataefficently,store data organized nanner
        // array farklı farklı verailbe ları destekler aynı anda int double char  staring  ları destekler
        // size is fixed...ne kadar data olacagını belirleyecegğiz
        //3 tane dat structure var 1-Array   2-Collektion  3-Map
        //[] brecets ya data typdan sınra yadava verailbdan sonra konur

        // create a variable data that's capable caontains five names

       // System.out.println(myGroup);//bu şekilde yadırmaz hata verir
       // System.out.println(Arrays.toString(myGroup));;//sonuc null cıkar cunkı isimleri belirlemedik
      //  String[]myGroup=new String[5];
     String[] myGroup=new String[5];
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";

        //array sadece kac data kullanılacagi biliniyorsa kullanılır
        System.out.println(Arrays.toString(myGroup));//Gunay ,Neira,Suat,Hulya ,Mikael
        System.out.println("-----------");
        Arrays.sort(myGroup);
        System.out.println(Arrays.toString(myGroup));
    }
}
