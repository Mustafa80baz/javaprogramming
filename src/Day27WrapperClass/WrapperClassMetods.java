package Day27WrapperClass;

public class WrapperClassMetods {
    public static void main(String[] args) {

        String str ="123";
       int num= Integer.parseInt(str);//int olur böylece Integer int e dönuşur aouto yada unboxing değil
        System.out.println(num+1);//124
        System.out.println(str+1);//1231 concetinatoın//

        String as="10.5";
        double cb=Double.parseDouble(as);//double to double nothıng
        System.out.println("double: "+cb);
        System.out.println("-------------------------------");
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
       byte max1 =Byte.MAX_VALUE;
       byte min1= Byte.MIN_VALUE;
        System.out.println("max1 = " + max1);
        System.out.println("min1 = " + min1);

        System.out.println("----------bolean method----------");

        String str1="ture";//true dısında yazılan herşeye false verir.
        boolean b1=Boolean.parseBoolean(str1);
        System.out.println("b1 = " + b1);



    }
}
