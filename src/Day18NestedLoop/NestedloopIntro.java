package Day18NestedLoop;

public class NestedloopIntro {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Wooden Spoon");// 5 kere wooden spoon yazdırır/ 20 kere yazdırmak istersek
// yeni bir for loop acıp onun içine 1.loop umuzu yerleştırıyoruz ve kere tekrar ediyor
        }
        System.out.println("-------------------------------");
        for (int j = 0; j <4 ; j++) {//alttaki loopun içindekini j*i nin carpımı kadar yazdırır

            for (int i = 0; i <5 ; i++) {  //bu loop for lopun icinde olacak
                System.out.println("Wooden Spoon");
            }

        }
    }
}
