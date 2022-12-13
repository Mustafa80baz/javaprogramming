package weekday09IfDevam;

public class IfAndElseStatem {

    public static void main(String[] args) {

//if(conndition){ en aza üç secenek li durumlar da kullanılır  hangisi doğru ise onu yazdırır
        int a=45;
        char grade;

        if(a>=90){
            grade='A';
         if (a>=80  && a<=89) {
                    grade='B';

                } else if (a>=70  && a<=79) {
                    grade ='C';

        }

        } else if (a>=60) {
            grade ='D';

        } else  {
            grade='F';

        }
        System.out.println(grade);

        System.out.println("-------------------");

        char vgrade =(a>=90)? 'A':(a>=80)? 'B':(a>=70) ? 'C': (a >=60)? 'D':'F';

        System.out.println(vgrade);


        System.out.println("-------------------------------");

        int num2=200;

        int num1=100;// sayı negatf mi pozzitif mi 0 mi? 3 secenek

        if (num1 >num2){
            System.out.println("num1 is maximum");
        } else if (num1<num2) {
            System.out.println("Num2 is maximum");


        }else {
            System.out.println("eşitler");
        }
        System.out.println("--------------------------");
        String s = (num1 < num2) ? "Num2 max" : (num1 > num2) ? "Num1 is max" : "eşitler";

        System.out.println("--------------------");

        int t=80;
        char griade; // a or b or  c d f


    }
}
