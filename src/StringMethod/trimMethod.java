package StringMethod;

public class trimMethod {
    public static void main(String[] args) {
        String a="         Cydeo good   ";
        System.out.println( a);// başta sondaki aralıkları yazdırır
        a=a.trim();
        System.out.println( a);// trim metodu ile aralıkları kaldırır
    }

}
