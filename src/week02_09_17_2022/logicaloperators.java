package week02_09_17_2022;

public class logicaloperators {

    public static void main(String[] args) {
        int  age =19;

        String name ="jean";
        String citizen ="UK";

        boolean isEligible= age>=18 && citizen=="UK";
        System.out.println(isEligible);

        String name2="josh";
        int   creditScore= 740;
        int age1=23;
    int income=7000;
        boolean isEligible2=age1>=21 && creditScore >=720&& income >=4000;
        System.out.println(" Josh is Eligible2 = " + isEligible2);
        int age3 =21;

        char gender='F';

        boolean isEligible3=age>=18 && (gender=='M'|| gender=='F');
        System.out.println("Josh is Eligible3 = " + isEligible3);
        System.out.println(" ------------------------------------");

        String name4="James";
        String countrOfBirth="US";
        Boolean marriedToUsCitizen=true;

        boolean isEligible5=countrOfBirth=="UK" || marriedToUsCitizen==true;

        System.out.println("James is Eligible5 = " + isEligible5);





    }
}
