public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    
    public double checkBalance() {
        return balance;
    }

    public double calculateInterest(double rate) {
        return balance * rate / 100;
    }
}


