package Day21ForEachLoopPractice;

public class RversNames {
    public static void main(String[] args) {
        //İsimleri tersten Yazdırma...önce her bir ismi tek tek alacaz
        String[]names={"Elminur Ablimit"," Ali Kilic","Hulya Keles","Simen Kaya","Begenc Begenjov","Ruveyda Durna"
                ,"Jonathan Holly","Alshuan Rodgers","Manas Kalenov","Gulsen Sohret"};

        for (String each: names) {//each =butun isimler
      String reversed="";
            for (int i = each.length()-1; i >=0 ; i--) {//tesrten yazdırma formulu
                reversed+=each.charAt(i);

            }
            System.out.println(reversed);
        }
    }
}
