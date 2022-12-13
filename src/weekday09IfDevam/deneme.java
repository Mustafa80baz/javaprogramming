package weekday09IfDevam;

public class deneme {
    public static void main(String[] args) {
        int b =2;

        String result ="";

        if (b>=1 && b<=9){

            switch (b){
                case 1: case 2:  case 3:
                  result="çok basarlı";
                                   result="Basarılı";

                    result="calışması lazım";


                case 4:
                    result ="başarısız";
                case 5:
                    result="hımm kötü";
                case 6:
                    result="valla kötü";
               case 7:
                    result="bööek çok çook berbat";


            }

        }

        else {
            System.out.println("böyle bir not yok");

        }
        System.out.println(result);
    }
}