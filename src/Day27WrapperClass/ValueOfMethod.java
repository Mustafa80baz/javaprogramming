package Day27WrapperClass;

public class ValueOfMethod {
    public static void main(String[] args) {
        String str="123";
  Integer num= Integer.valueOf(str);//Integer veririr
int num1=Integer.valueOf(str);
int num2=num1;
num1=num;
num=num2;
        System.out.println(num1);
        System.out.println("--------------------double-----");
        String str3="1.5";
        Double str4=Double.parseDouble(str3);
        System.out.println("str4 = " + str4);

    }
}
