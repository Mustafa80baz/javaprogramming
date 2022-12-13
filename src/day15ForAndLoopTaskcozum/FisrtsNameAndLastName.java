package day15ForAndLoopTaskcozum;

public class FisrtsNameAndLastName {
    public static void main(String[] args) {

        ////soru 3 Write a program that asks user to enter first and last name then  prints the full name in regular format
        //        // input :cyDEo  last name SCHOOL  output :Cydeo School

        String firstName="cyDEo ";
        String lastName="SCHOOL  ";
       firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
      // 0 dan bala 1 e kadar buyuk harf yap "C" yi buyuk yapar  burası Charla yapılamz. Charla olursa uppercase gelmez seceneklerde
        //2. kıısmda concatination yaptık ve 1. harften sonuna kadar küçük yap dedik büüyk olan DE yi küçük yaptı
       // firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println(firstName);
        String fir=""+firstName.toUpperCase().charAt(0)+firstName.toUpperCase().charAt(1);
        System.out.println(fir);

        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println("lastName = " + lastName);
        String fullName= firstName+lastName;
        System.out.println("fullName = " + fullName);

    }
}
