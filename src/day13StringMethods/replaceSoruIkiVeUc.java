package day13StringMethods;

public class replaceSoruIkiVeUc {
    public static void main(String[] args) {
        // write a progm. user to enter a word . cümlde bir den fazla yanlışlıkları düzelt

        String str="xcodeX";
      String rresult= str.replace("x","a").replace("X","a");
        System.out.println(rresult);

        System.out.println("------------------------------");
        String firstName="cyDEo";
        String lastName="SCHOOL";
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        System.out.println("firstName = " + firstName);

lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println("lastName = " + lastName);
        String fullName=firstName+" "+lastName;
        System.out.println("fullName = " + fullName);
    }
}
