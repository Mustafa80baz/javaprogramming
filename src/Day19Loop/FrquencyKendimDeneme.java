package Day19Loop;

public class FrquencyKendimDeneme {
    public static void main(String[] args) {

String str="aabbcccd";
    String result="";
        for (int j = 0; j < str.length(); j++) {
            int say=0;
            char ch=str.charAt(j);
            for (int i = 0; i <str.length() ; i++) {
                char rach=str.charAt(i);
                if (rach==ch){
                    say++;
                }
            }
        if (result.contains(""+ch)){// her harfin kac adet oldugunu harf +sayı ile gösterdik
            continue;
        }
        result +=ch;
            result +=say;

        }

        System.out.println(result);
    }

}
