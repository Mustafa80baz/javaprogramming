package Day31daydankalanTaskCözümü;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo  (String accountHolder, long accountNumber, double balabce) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balabce= $" + balance +
                '}';
    }

    public void chechkBalance(){
        System.out.println("Your Available balace is : "+balance);
    }

    public void deposit(double amount){// deposit verildiğinde balancada görunmesi için buraya yazılır

        if (amount<=0){
            System.out.println("Your amount is not enouh  ");
            return;
        }
        balance+=amount;
    }

public void withdraw(double amount){
        if (amount>balance){
            System.out.println("Insufficient balance");
            return;
        }
        if (amount<=0){
            System.out.println("Withdrawing amount can not be negative ır zero");
            return;
        }
        balance-=amount;
}
}
