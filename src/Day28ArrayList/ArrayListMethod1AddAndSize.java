package Day28ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1AddAndSize {
    public static void main(String[] args) {
        //first Method Add Method
        ArrayList<Integer>nubers=new ArrayList<>();//şuan da hiç elamnı yok arraylist bos
        System.out.println(nubers);
        //first Method Add Method
        nubers.add(10);//implicitly veya outoboxing   arrayya bir element otomatik ekler ekler//index=0
        System.out.println("nubers = " + nubers);
        nubers.add(20);//1
        nubers.add(30);//2
        nubers.add(40);//3
        nubers.add(50);//4
        System.out.println(nubers);//[10, 20, 30, 40, 50]
        //eger araya 20 ile 30 arasına bir element 25 eklemek istersem index numrasını otomatik yeniden sıralar 25 in
        //index numrası 2 olur digerleri de ona göre değişir.
        nubers.add(2,25);//bunu ekleyince
        System.out.println(nubers);//[10, 20, 25, 30, 40, 50]
        nubers.add(5,45);
        System.out.println(nubers);//[10, 20, 25, 30, 40, 45, 50]
        //index kapasitemiz  6 idi bir tane dah aekleyince kapasitemizi otomatik 7 yaptı
        System.out.println(nubers.size());//element sayısını verir.=su an 7
        int lastIndex=nubers.size()-1;//son indexi verir
        System.out.println("lastIndex = " + lastIndex);
        System.out.println("---------get method------------");
       int number=nubers.get(3);
        System.out.println("number get = " + number);
        System.out.println("----------------butun elemetleri yazdırma-----------------");
        for (int i = 0; i < nubers.size(); i++) {
            System.out.print(nubers.get(i)+" ");
            
        }
        


    }
}
