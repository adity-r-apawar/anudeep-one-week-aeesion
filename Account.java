public class Account {
    private int accountNumber;
    private double balance;
    private Customer customer;

    // Constructor
    public Account(int accountNumber, double initialBalance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.customer = customer;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for customer
    public Customer getCustomer() {
        return customer;
    }
}
