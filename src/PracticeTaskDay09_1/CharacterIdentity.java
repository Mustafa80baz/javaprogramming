package PracticeTaskDay09_1;

public class CharacterIdentity {
    public static void main(String[] args) {


        char ch='@';

        if ((ch>='A' && ch<='Z' ) ||(ch>='a'  || ch <= 'z')  || (ch>=1 && ch <=9)  ){

    String valid=(ch>='A' && ch<='Z')? "Alphabet ": (ch>=1 && ch <=9)?"digit ":"default" ;
            System.out.println(valid);
    }else {
            System.out.println("geçersiz işaret");
        }


}

}


