package Day21ArrayMetods;

import java.util.Arrays;

public class ArrayEqualsMethod {
    public static void main(String[] args) {
        //equals(arra1,arra2)
        int[] arra1={1,3,2};
        int [] array2={1,2,3};
        boolean equal= Arrays.equals(arra1,array2);//equal metodu boollean la oldugundan boollean aldık
        System.out.println(equal);
        System.out.println("------sıraya koyup karşilastır----------");
       Arrays.sort(arra1);
       Arrays.sort(array2);
       boolean re=Arrays.equals(arra1,array2);

        System.out.println(re);
    }
}
