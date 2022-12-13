package weekday09IfDevam;

public class Browser {
    public static void main(String[] args) {

        String browserName="crome";  //crome ,firefox,opera,safari,edge

        String result="";

        boolean validBroser=browserName=="crome" || browserName=="firefox" || browserName =="opera"  || browserName=="safari" || browserName=="edge";

        if (validBroser){
            if (browserName=="crome"){
            result="crome Browser selected";

            } else if (browserName=="firefox") {
                result="FireFox Browser selected";

            } else if (browserName =="opera") {
                result="Opera Browser selected";

            } else if (browserName=="safari" ) {
                result="Safari Browser selected";

            }else {
                result = "edge browser is selected";
            }

        }else{
            result="invalide Broser Name";
        }

        System.out.println(result);
        System.out.println("__________________________");

        String gunAdi="Cuma";  ////pazar pazartesi salı çarşamba perşembe cuma

        String sonuc="";
        boolean gecerliGun = gunAdi=="Cuma" || gunAdi=="pazar " || gunAdi =="pazartesi" || gunAdi=="salı" || gunAdi=="çarşamba" || gunAdi== "perşembe"|| gunAdi =="Cuma";

        if (gecerliGun){

            if (gunAdi=="pazartesi"){
                sonuc="ilk gün";

            } else if (  gunAdi=="salı" ) {
                sonuc="2.gün";


            } else if (gunAdi=="çarsamba") {
                sonuc="3. gün";

            } else if (gunAdi=="perşembe") {
                sonuc="4. gün";

            } else if (gunAdi=="Cuma"){

                sonuc="mubarek gun ";

            } else{
                sonuc="Tatil";

            }

        }else {
           sonuc="haftadısı";

        }
        System.out.println(sonuc);
        }

        }






