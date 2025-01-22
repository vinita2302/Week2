 class BankAccount {

    // Static variable shared across all accounts
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0; // To track total number of accounts

    // Final variable to ensure account number cannot be changed
    private final int accountNumber;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber) {
        // Using 'this' to resolve ambiguity between instance variables and parameters
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++; // Increment total accounts whenever a new account is created
    }

    // Static method to display total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    // Instance method to display account details
    public void displayAccountDetails() {
        // Using 'instanceof' to check if the object is an instance of BankAccount
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid object type.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create bank accounts
        BankAccount account1 = new BankAccount("Alice", 1001);
        BankAccount account2 = new BankAccount("Bob", 1002);

        // Display account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Display total accounts
        BankAccount.getTotalAccounts();
    }
}
