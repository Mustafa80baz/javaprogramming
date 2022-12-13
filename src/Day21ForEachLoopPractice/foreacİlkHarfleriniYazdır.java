package Day21ForEachLoopPractice;

public class foreacİlkHarfleriniYazdır {
    public static void main(String[] args) {
        String[]names={"Cydeo School","Wooden Spoon","Java Programming","SQL Programmimng","Seleniun Automation","API Testing"
                ,"Database Testing","manuel Testing"};
        //Her kelimenin ilk harflerini yazdıracaz
       for ( String each :names){
          String ilkharf=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
           System.out.println(ilkharf);
        }
    }
}
