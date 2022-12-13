package Day20Array;

public class FindingTheMaxNumberArrayD {
    public static void main(String[] args) {

        //max ı bulacagız
    int []number={10,5,4,20,1,0};
        System.out.println(number[2]);//index 2 yi yani 4  ü yazdırır
    int max=number[0];//ilk sayının en buyuk oldugunu varsayarak digerleriyle karşılaştıracagız ilk sayımız(number[0])=10
        for (int i = 0; i < number.length; i++) {
            if (number[i]>max){//eger array içinde max numberdah daha buyuk bir sayı varsa busefer o max olacak
    max=number[i];//artık max number bu olarak atandı
            
        }
    }
        System.out.println(max);
}
}