package Day24CustomMethodReturn;

public class MethodRevers {
    public static void main(String[] args) {
        String str ="Java";
     reverse(str);
    }
    public static void reverse(String str){

        String reverse="";
        for (int i =str.length()-1; i >=0 ; i--) {
            reverse +=str.charAt(i);

        }
        System.out.println(reverse);
    }

}
