package day13StringMethods;

public class equalAndequalIngnoreCaseMotheod {
    public static void main(String[] args) {
        String s1="Cydeo";
        String s2="CYDEO";
      s1.equals(s2);
        System.out.println(s1.equals(s2));

        System.out.println((s1.equalsIgnoreCase(s2)));
        System.out.println("-----------------------");
        String as1="yaptım";
        String as2="YAPTIM";
        as1.equals(as2);
        System.out.println(as1.equals(as2));
        System.out.println(as1.equalsIgnoreCase(as2));

    }
}
