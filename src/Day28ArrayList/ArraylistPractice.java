package Day28ArrayList;

import java.util.ArrayList;

public class ArraylistPractice {
    public static void main(String[] args) {
        /*Multiply every single number by 2
     Ex:input {1,2,3,4,5,6}
      out put {2,4,5,6,8,10,12}
         */

        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);//İndex 0 =i=10*2
        list.add(23);//İndex 1=i23*2
        list.add(34);//İndex 2=i
        list.add(45);//İndex 3=i
        list.add(56);//İndex 4=i
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) *2);

        }
        System.out.println(list);

        System.out.println("-----------remove method-----------");
        ArrayList<String>employees=new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");
        System.out.println(employees);
        employees.remove(0);
        System.out.println("employees = " + employees);
        employees.remove(0);//it removes given index numberindexi 0 olan elemeti remove etti
        System.out.println(employees);
        employees.remove(2);//primiteve
        System.out.println(employees);
        employees.remove(employees.size()-1);//son elementi remove etti
        System.out.println(employees);
        System.out.println("---------remove by object---------");
        employees.remove("Hulya");//String non primitive oldugundan direk remove eder
        System.out.println(employees);
        employees.remove("Olga");
        System.out.println(employees);
        boolean re=employees.remove("Neira");
        System.out.println(employees);

        System.out.println("re = " + re);




    }
}
