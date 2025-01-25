package Main.hierarchical_inheritance.bankaccount;

class FixedDepositAccount extends BankAccount {
    private int lockInPeriod; // in months

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance); // Call superclass constructor
        this.lockInPeriod = lockInPeriod;
    }

    // Method to display lock-in period
    public void displayLockInPeriod() {
        System.out.println("Lock-In Period: " + lockInPeriod + " months");
    }

    // Overriding displayAccountType
    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
