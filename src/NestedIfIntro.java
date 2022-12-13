public class NestedIfIntro {
    public static void main(String[] args) {

        // pre condition statement demenk herşeyden öce durumu anla kont rol et tam doğru( Nestedif and else)
    int not=755;

    if (not>=0 && not<=100){
         if (not>=60){
             System.out.println("geçti");
         }else {
             System.out.println("kaldı");
         }


    }else{
        System.out.println("yanlışlık var");
    }
        System.out.println("---------------------");

    int a=100;//max numberı bul
    int b=200;
    int max;

    if (a>b){
        max=a;
    }else {
        max=b;

    }
         System.out.println(max);

        System.out.println("*******************");
        int mav= (a>b)? a : b;
        System.out.println(mav);

}
}