package Day20Array;

public class NameOfMonthsWithLoop {
    public static void main(String[] args) {
        String[]month={"Janu","Febr","March","april","may","jun","july","august","Sempte","October","Novwem","December"};
        /*
        System.out.println(month[0]);
        System.out.println(month[1]);
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);// tektek yazdırmak yerine loopla yapabiliriz
        */

        for (int i = 0; i <month.length; i++) {//ayların tamamını yazdırı. -1 demedik çünki denlem zaten lengt ten küçük(<)tür işareti
            System.out.print(" "+month[i]);



            }
        System.out.println();
            System.out.println("-----------sondan başa yazdıram---------------");

            for (int j = month.length-1; j>=0; j--) {
                System.out.print(month[j]+" ");
        }
    }
}
