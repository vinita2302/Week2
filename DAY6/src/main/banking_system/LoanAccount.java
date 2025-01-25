package main.banking_system;


class LoanAccount extends SavingsAccount implements Loanable {
    private double loanAmount;
    private boolean isEligible;

    public LoanAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            loanAmount = amount;
            System.out.println("Loan approved for: " + amount);
        } else {
            System.out.println("Loan application denied.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        isEligible = getBalance() >= 5000; // Example condition
        return isEligible;
    }
}