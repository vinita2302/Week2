package Main.hierarchical_inheritance.bankaccount;

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call superclass constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overriding withdraw method to enforce withdrawal limit
    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal amount exceeds limit of $" + withdrawalLimit);
        } else {
            super.withdraw(amount); // Call superclass withdraw method
        }
    }

    // Overriding displayAccountType
    @Override
    public void displayAccountType() {
        System.out.println("Checking Account");
    }
}
