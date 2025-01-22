import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, String accountType, double initialDeposit) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        BankAccount account = new BankAccount(accountType, initialDeposit, this.name);
        customer.addAccount(account);
        System.out.println("Account opened successfully for " + customer.getName() + " in " + this.name + " Bank.");
    }

    public void listCustomers() {
        System.out.println("Customers of " + this.name + " Bank:");
        for (Customer customer : customers) {
            System.out.println("- " + customer.getName());
        }
    }

    public String getName() {
        return name;
    }
}

// Customer class
class Customer {
    private String name;
    private List<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (BankAccount account : accounts) {
            System.out.println("  - " + account.getAccountType() + " account at " + account.getBank() + ": $" + account.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

// BankAccount class
class BankAccount {
    private String accountType;
    private double balance;
    private String bank;

    public BankAccount(String accountType, double initialDeposit, String bank) {
        this.accountType = accountType;
        this.balance = initialDeposit;
        this.bank = bank;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String getBank() {
        return bank;
    }
}

// Main class to test the relationship
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Global Trust");
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bank.openAccount(customer1, "Savings", 500);
        bank.openAccount(customer1, "Checking", 1000);
        bank.openAccount(customer2, "Savings", 300);

        customer1.viewBalance();
        customer2.viewBalance();
        bank.listCustomers();
    }
}
