package Week10_11_2022AdamOverview;

public class WrapperIntro {
    public static void main(String[] args) {
        int a=2;
        Integer b=122;
        String number="100";
        String number1="200";
        String result=number+number1;
        System.out.println(result);
        int result1=Integer.parseInt(number);//100/7string i int yapar
        int result2=Integer.parseInt(number1);//200
        System.out.println(result1+result2);
    }

}
