package Day28ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindNstlargestNumber {
    public static void main(String[] args) {
        //write a program tah can return the nth largets number
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,7));
        /*
        int max1= Collections.max(list);
        System.out.println("1.st max = " + max1);//maxı bıulut
        list.removeIf(p->Collections.max(list)==p);
        System.out.println("list = " + list);
        int max2=Collections.max(list);
        System.out.println("max2 = " + max2);
         *///bir yolu
        //3. buyuk numarayı bulmanın 2.yolu
        int n=3;
        for (int i = 1; i < n; i++) {
            list.removeIf(p-> Collections.max(list)==p);

        }
        int max=Collections.max(list);
        System.out.println("max = " + max);
    }
}
