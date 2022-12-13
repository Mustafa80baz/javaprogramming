package weekday09IfDevam;

public class SalarayCalculator {
    public static void main(String[] args) {

        double salary=75_000;
        boolean Ismarried =true;
        double taxRate=0;

    String netsalary;
    if (salary >=130.000 ){
      taxRate=0.35;
    } else if (salary>=100000) {
        taxRate=0.30;

    } else if (salary>=80000) {
        taxRate=0.25;

    }else {
        taxRate=20;
    }

    if (Ismarried){
        taxRate -=0.05;

    }
    double salaryAfterTaxe=salary-(salary*taxRate);
        System.out.println(salaryAfterTaxe);


    }
}
