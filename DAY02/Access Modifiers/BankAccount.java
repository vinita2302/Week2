class BankAccount {
    public String accountNumber; 
    protected String accountHolder; 
    private double balance; 

    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass to demonstrate access to accountNumber and accountHolder
class SavingsAccount extends BankAccount {

    private double interestRate; 

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
  
    public void displayAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Accessing public member
        System.out.println("Account Holder: " + accountHolder); // Accessing protected member
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


public class BankAccountManagement {
    public static void main(String[] args) {
        // Create BankAccount instance
        BankAccount account = new BankAccount("123456", "Alice", 1000.00);
        account.displayAccountDetails();

        // Modify balance
        account.setBalance(1200.00);
        System.out.println("\nAfter updating balance:");
        account.displayAccountDetails();

        // Create SavingsAccount instance
        SavingsAccount savingsAccount = new SavingsAccount("654321", "Bob", 2000.00, 3.5);
        System.out.println("\nSavings Account Details:");
        savingsAccount.displayAccountDetails();
    }
}