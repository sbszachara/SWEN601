package testprep;

public class BankAccount {

    private String accountHolder;
    private double balance;
    static int accountCount = 0;

    public BankAccount(String a, double b) {
        this.accountHolder = a;
        this.balance = b;
        accountCount = accountCount + 1;
    }

    public static int getaccountCount() {
        return accountCount;
    }
    
}
