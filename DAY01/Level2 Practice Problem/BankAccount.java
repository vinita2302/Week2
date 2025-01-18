class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Successfully withdrawn: $" + amount);
            } else {
                System.out.println("Insufficient balance. Withdrawal failed.");
            }
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("John Doe", "1234567890", 1000.00);

        account.displayBalance();

        // Depositing money
        account.deposit(500.00);
        account.displayBalance();

        account.withdraw(300.00);
        account.displayBalance();

        account.withdraw(1500.00);
        account.displayBalance();
    }
}
