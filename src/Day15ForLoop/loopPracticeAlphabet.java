package Day15ForLoop;

public class loopPracticeAlphabet
{
    public static void main(String[] args) {

        //Print A~z   ..a~z ....Z~A....a~z yadır bunları


        for ( char i ='A'; i <='Z'; i++){
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("-----------------");

        // ikinci yolu IcI  tablosundan a nın ve z nin değerini bulup bunla rarasını yazdır deriz
// yine harfleri verir
        for (char i = 65; i <=90 ; i++) {
            System.out.print(" "+i);


        }
        System.out.println();
        for (char d='z'; d>='a';d--){
           System.out.print(d+" ");
        }
        System.out.println();
        for (char i = 'a'; i <='z' ; i++) {
            System.out.print(" "+i);
                    }
        System.out.println();
    }
  }
