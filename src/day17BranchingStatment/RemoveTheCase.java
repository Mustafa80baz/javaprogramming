package day17BranchingStatment;

public class RemoveTheCase {
    public static void main(String[] args) {
        String s="AACCBB";
        String re="";
        for (int i = 0; i < s.length() ; i++) {
         String   ch="" + s.charAt(i);// charart ıçine (stringi temsil eden (i) yazabilmek için bunu
            // Stringr ceviriyoruz
            if (re.contains(ch)){//eger A zaten varsa ch nin içinde atala(continue)+ contains string kabul eder
                // onun için de ch i string e ceviriyoruz
                continue;
        }
            re +=ch;

    }
        System.out.println(re);
}
}