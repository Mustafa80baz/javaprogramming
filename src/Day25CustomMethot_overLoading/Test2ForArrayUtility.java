package Day25CustomMethot_overLoading;

import Utilities.ArraysUtility;

public class Test2ForArrayUtility {
    public static void main(String[] args) {
      int []arr1={1,2,3,4,5};
      ArraysUtility.printElement(arr1);
        System.out.println("-----------------------");
        double []arr2={1.1,2.2,3.3,4.4,5.5};
        ArraysUtility.printElement(arr2);
        System.out.println("----------------------------");
        char []arr3={'A','B','C','G'};
        ArraysUtility.printElement(arr3);
        System.out.println("-----------------------");
        String[] names={"Tatiana","Olexsadr","Ali","Veli"};
        ArraysUtility.printElement(names);
      System.out.println("-------------------");
      int []nu1={1,2,3,4,5,6};

int max1=ArraysUtility.max(nu1);
      System.out.println(max1);
      System.out.println("---------------------------");
      double[] num2={1.1,2.2,3.3,4.4,5.5};
      double manu=ArraysUtility.max(num2);
      System.out.println(manu);
      System.out.println("-------------------");

      int []nu12={1,2,3,4,5,6};

      int min=ArraysUtility.minnumber(nu12);
      System.out.println(min);
      System.out.println("---------------------------");
      double[] nutm2={1.1,2.2,3.3,4.4,5.5};
      double min1=ArraysUtility.minnumber(nutm2);
      System.out.println(min1);
      System.out.println("-------containsmethod-------");

      int []num12={1,2,3,4,5,6};//5 var mı içinde
      boolean iscont=ArraysUtility.contains(num12,10);
      System.out.println(iscont);//true yani5 varmış 10 var mı bakalı


    }
}
