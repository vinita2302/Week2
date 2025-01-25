package Main.hierarchical_inheritance.bankaccount;

public class BankingSystem {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savings = new SavingsAccount("SA123", 5000, 3.5);
        savings.displayAccountType();
        savings.deposit(1000);
        savings.calculateInterest();
        System.out.println();

        // Create a CheckingAccount object
        CheckingAccount checking = new CheckingAccount("CA456", 3000, 1000);
        checking.displayAccountType();
        checking.withdraw(1200); // Exceeds limit
        checking.withdraw(800);  // Within limit
        System.out.println();

        // Create a FixedDepositAccount object
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FDA789", 10000, 12);
        fixedDeposit.displayAccountType();
        fixedDeposit.displayLockInPeriod();
    }
}


