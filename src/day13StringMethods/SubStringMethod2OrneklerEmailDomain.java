package day13StringMethods;

public class SubStringMethod2OrneklerEmailDomain {
    public static void main(String[] args) {
        //Write a program that can get teh domain of the email.(Assume that a valid email is given
        //Ex:mfbaz@hgmail.com  output gmail
        String email="Cydeo.Scholo@gmail.com";
        int  beginningIndex =email.indexOf("@")+1;
        int endingIndex =email.lastIndexOf(".");
        String domain=email.substring(beginningIndex,endingIndex);
        System.out.println("domain = " + domain);
        System.out.println("---------------------------------------");
        String str1="Java is fun,Java is cool";

        int beginingIndex2=str1.indexOf(0)+1;
        int endinigIndex2=str1.lastIndexOf(",");
        String bul=str1.substring(beginingIndex2,endinigIndex2);
        System.out.println("bul = " + bul);

        //aynı sonuca ulaşmanın 2.yolu
        String bull=str1.substring(0,10+1);
        System.out.println("bull = " + bull);
        System.out.println("-----------------------------");
        //Java is cool tarafını nasıl yazdırırız
        int beg=str1.lastIndexOf("J");
        String tr2=str1.substring(beg);
        System.out.println("tr2 = " + tr2);



    }
}
