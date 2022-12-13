package StringMethod;

public class IndexNumberHarfNumarasi {
    public static void main(String[] args) {
        String str="Wooden Spoon";
        int firstNumber=str.indexOf("o");
        System.out.println("firstNumber = " + firstNumber);
        int Indexsecond=str.indexOf("od");
        System.out.println("Indexsecond = " + Indexsecond);
        int Indexthirtchar=str.indexOf(" S")+1;
        System.out.println("Indexthirtchar = " + Indexthirtchar);
        int indexLasindex=str.lastIndexOf("o");
        System.out.println("indexLasindex = " + indexLasindex);

    }
}
