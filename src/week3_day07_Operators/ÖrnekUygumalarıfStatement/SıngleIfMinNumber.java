package week3_day07_Operators.ÖrnekUygumalarıfStatement;

public class SıngleIfMinNumber {
    public static void main(String[] args) {

        int n1=10;
        int n2=20;

        // 100 MİNUMUM NUMBER YAZDIRMAK İÇİN 3 YOL VAY
        //ihtimaller bu şekilde yazılmalı

        boolean Isminnum=n1<n2; //100< 200 de ise
        boolean Ismin=n2<n1; // 200<100 den ise
        boolean equal=n1==n2;// eşitlerse bu üçünden hangisi doğru ise onu yazdırır

        if (Isminnum){
            System.out.println(n1+" = is the mininum number");
        } else if (n2<n1) {
            System.out.println(n2 +"=is the minumun nuber");

        }else {
            System.out.println("equall");

        }

        System.out.println("-----------------------");

        int s=23;
        int s2=25;

        boolean IsMaxNum =s>s2;
        boolean IsMaxNum2=s<s;
        boolean IsMaxNum1 =s2>s;

        if (IsMaxNum){
            System.out.println(s+" is max number");

        } else if (IsMaxNum1) {

            System.out.println(s2+" is Max Number");


                    
        }

        System.out.println("------------------------");
                
        int age=14;
        boolean EligibleToBuy =age>=18;//bollen de formulü yaz
        boolean NotEligibleToBuy=age<18;

        if(EligibleToBuy){
            System.out.println("EligibleToBuy = " + EligibleToBuy);
            
        } else  {
            System.out.println("Not EligibleToBuy " );

        }

    }


}

