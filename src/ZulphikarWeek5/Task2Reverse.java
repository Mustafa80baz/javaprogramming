package ZulphikarWeek5;

public class Task2Reverse {
    public static void main(String[] args) {
                    String str="Laptop";
            String reverse="";
            for (int i = str.length()-1; i >=0 ; i--) {
                char ch=str.charAt(i);
                reverse+=ch;
            }
            System.out.println(reverse);


    }


}
