package day17While_DoWhileLoop;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
    String srt="BAZ baz daz DUZ bAz";
    int fr=0;
        for (int i = 0; i <=srt.length()-3 ; i++) {
            String each=srt.substring(i,i+3);
            if (each.equalsIgnoreCase("BAZ")){
                fr ++;

            }
    }
        System.out.println("fr = " + fr);
}
}