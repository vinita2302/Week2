package main.banking_system;

interface Loanable {
    void applyForLoan(double amount);

    boolean calculateLoanEligibility();
}
