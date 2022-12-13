package Day31daydankalanTaskCözümü;

public class bankobjectCapitalOne {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount();
     account1.setInfo("Mustafa Baz",1234532,3450667);
        System.out.println("account = " + account1);
        account1.deposit(1000);
        account1.chechkBalance();;
        account1.withdraw(900);
        System.out.println(account1);
        System.out.println("-------------2.bank account object-----------");

       BankAccount account2 =new BankAccount();
       account2.setInfo("Aygun",23456743,3450);
       account2.deposit(2000);
       account2.withdraw(200);
       account2.chechkBalance();
       account2.deposit(500);

       account2.chechkBalance();


    }


}
