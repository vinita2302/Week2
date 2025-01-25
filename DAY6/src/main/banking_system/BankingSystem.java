package main.banking_system;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", "Alice", 10000);
        BankAccount current = new CurrentAccount("CA123", "Bob", 5000);

        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Current Account Interest: " + current.calculateInterest());

        savings.deposit(2000);
        savings.withdraw(500);

        LoanAccount loanAccount = new LoanAccount("LA123", "Charlie", 7000);
        loanAccount.applyForLoan(20000);
        System.out.println("Loan Eligibility: " + loanAccount.calculateLoanEligibility());
    }
}
