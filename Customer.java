public class Customer {
    private String name;
    private int accountNumber;

    // Constructor
    public Customer(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}
