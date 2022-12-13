public class NameOfMonth2 {
    public static void main(String[] args) {

    int a=41;
    String mont="";
    if (a>=1 && a<=12){

         if (a==1){
        mont="january";

            } else if (a==2) {
        mont="feb";
             } else if (a==3) {
        mont="march";

         } else if (a==4) {
        mont="april";
         }else {
        mont="haziran";

            }


    }else {
    mont=("atladık");

    }
        System.out.println(mont);

    System.out.println("*****************************************");
String ay=(a>12)? "atladık":(a==1)?"january": (a==2)?"february":(a==3)?"march":(a==4)?"april":"Haziran";
        System.out.println(ay);


    }

}
