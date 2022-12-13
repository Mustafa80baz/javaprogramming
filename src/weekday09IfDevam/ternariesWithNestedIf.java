package weekday09IfDevam;

public class ternariesWithNestedIf {
    public static void main(String[] args) {

        int a=88;
        if (a>=0  && a<=100){
             if (a>=60){
                 System.out.println("passed");
             }else {
                 System.out.println("failed");
             }

        }else{
            System.out.println("invalid not");

        }
  String  sonuc=(a>=0 && a<=100)? (a>=60)?"Passed":"Failed":"invalid not";

    }
}
