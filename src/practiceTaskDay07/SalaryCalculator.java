package practiceTaskDay07;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate=50;
        double weeklyHours=45;
        int  stateTaxrate=6;
       double federalTaxrate=26;
        double yearlyRate=hourlyRate*weeklyHours*52;
         int stateTaxRate= (int) (yearlyRate*stateTaxrate/100);
        double federalTaxRate=yearlyRate*federalTaxrate/100;
       int totalTax= (int) ((int)stateTaxRate+federalTaxRate);
        double netİncome=yearlyRate-totalTax;
        System.out.println("Gross pay is = " + yearlyRate);
        System.out.println("federal Tax is = " + federalTaxRate);
        System.out.println("state Tax is = " + stateTaxRate);
        System.out.println("Total tax is = " + federalTaxRate+stateTaxrate);
        System.out.println("net income is = " +netİncome);





    }

}
