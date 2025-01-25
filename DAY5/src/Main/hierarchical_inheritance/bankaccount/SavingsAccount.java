package Main.hierarchical_inheritance.bankaccount;

class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call superclass constructor
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        System.out.println("Interest Earned: $" + interest);
    }

    // Overriding displayAccountType
    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }
}