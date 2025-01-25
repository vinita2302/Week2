package Main.hierarchical_inheritance.bankaccount;

class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display account type (to be overridden by subclasses)
    public void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

