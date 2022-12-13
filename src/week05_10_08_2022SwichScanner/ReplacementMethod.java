package week05_10_08_2022SwichScanner;

public class ReplacementMethod {
    public static void main(String[] args) {
        // we can use replac or replace first

        String sentence="Java is hard prog language";
        String as=sentence.replace("hard","easy");
        System.out.println(as);
        System.out.println(sentence.replace("hard","fun"));
        System.out.println("---------------------------------");
        //replacefirst
                String sa1="Java is not same with java";
      String sa2=  sa1.replaceFirst("Java","Dava");
        System.out.println(sa2);

        String a ="Numan";
         a.toUpperCase();
        System.out.println(a);
    }
}
