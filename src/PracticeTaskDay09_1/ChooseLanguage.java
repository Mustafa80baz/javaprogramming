package PracticeTaskDay09_1;

public class ChooseLanguage {
    public static void main(String[] args) {

        int a=4;
        String language="";
        if (a>=1 && a<=5){

            switch (a){
                case 1:
                    language="hello thanks for your call";
                    break;
                case 2:
                    language="Hola,gracias para llamar";
                    break;
                case 3:
                    language="Merhab aradığınız için teşekkürler";
                    break;
                case 4:
                    language="Privet spasibo za vash zvonok";
                    break;
                case 5:
                    language="Merci ,pour votre appel";
                    break;

                default:
                    language="Şükran kesira";
                    break;

            }
            System.out.println(language);


       }
    }


}
