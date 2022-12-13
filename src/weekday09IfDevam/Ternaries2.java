package weekday09IfDevam;
public class Ternaries2 {
    public static void main(String[] args) {
//if(conndition){ en aza üç secenek li durumlar da kullanılır  hangisi doğru ise onu yazdırır
        int a=158;   char grade;
        if(a>=0 && a<=100){

            if(a>=90 && a<=100){
                grade='A';
            } else if (a>=80 ) {
                grade='B';
            } else if (a>=70 ) {
                grade ='C';
            } else if (a>=60) {
                grade ='D';
            } else {
                grade = 'F';
                System.out.println(grade);

            }

        }else {
            System.out.println("geçersiz puan");
        }


       char zgrade=(a>=90 && a<=100)? 'A':(a>=80)? 'B':(a>=70)?'C':(a>60)? 'D':'F';

        System.out.println(zgrade);

    }
}
