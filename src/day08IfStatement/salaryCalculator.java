package day08IfStatement;

public class salaryCalculator {
    public static void main(String[] args) {
        /*1 soru:declare the folloewing variables:
        hourlyrate,weeklyhour,stateTax,fedaralTax,

        2-use given info in above variable to calculate the following:
        salaryBeforeTax

         */

        int hourlyRate=65,// saatlik gelir
         weeklyHours=40;// haftalık calışma saati

        double statetaxe =0,
                fedaralTaxRate=26.2;

        //------------------------------------
        int salaryBeforeTax=hourlyRate*weeklyHours*52;// yıllık salary.saatlik *haftalık saatlik*yıllık haftalık:
        double stateTax=salaryBeforeTax*statetaxe/100;//vergi hesabında yıllık geliri *vergi tuatrı ile carp 100 e böl(vergi%6.5
        double fedaralTax=salaryBeforeTax* fedaralTaxRate/100;
        double totalTax=stateTax+fedaralTax;
        System.out.println("Gross pay is ="+salaryBeforeTax);
        System.out.println("State Tax is = "+stateTax);
        System.out.println("Fedaral Tax is ="+fedaralTax);
        System.out.println("Total tax is ="+totalTax);
        double Aftertax=salaryBeforeTax-totalTax;
        System.out.println("Salary after the tax is ="+Aftertax);




    }
}
