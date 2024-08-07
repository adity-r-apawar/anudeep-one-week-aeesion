
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	public class Custome {
	    private int id;
	    private String name;
	    private String email;
	    public Custome(int id, String name, String email) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	    
	    }

	    // Getters
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    // Setters
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    @Override
	    public String toString() {
	        return "Customer{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", email='" + email + '\'' +
	                '}';
	    }
	}

	class Customer{
	    private List<Customer> customers = new ArrayList<>();

	    // Add a Customer
	    public void addCustomer(Customer customer) {
	        customers.add(customer);
	    }

	    // Remove a Customer
	    public boolean removeCustomer(int id) {
	        return customers.removeIf(customer -> customer.getId() == id);
	    }

	    // Search for a Customer
	    public Customer searchCustomer(int id) {
	        for (Customer customer : customers) {
	            if (customer.getId() == id) {
	                return customer;
	            }
	        }
	        return null;
	    }

	    // List All Customers
	    public void listAllCustomers() {
	        for (Customer customer : customers) {
	            System.out.println(customer);
	        }
	    }

	    // Sort Customers by Name
	    public void sortCustomersByName() {
	        Collections.sort(customers, Comparator.comparing(Customer::getName));
	    }

	    // Sort Customers by ID
	    public void sortCustomersById() {
	        Collections.sort(customers, Comparator.comparingInt(Customer::getId));
	    }
	


public class Custome{
    private List<Customer> customers = new ArrayList<>();

    // Add a Customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Remove a Customer
    public boolean removeCustomer(int id) {
        return customers.removeIf(customer -> customer.getId() == id);
    }

    // Search for a Customer
    public Customer searchCustomer(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    // List All Customers
    public void listAllCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    // Sort Customers by Name
    public void sortCustomersByName() {
        Collections.sort(customers, Comparator.comparing(Customer::getName));
    }

    // Sort Customers by ID
    public void sortCustomersById() {
        Collections.sort(customers, Comparator.comparingInt(Customer::getId));
    }
}
 class Main {
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager();

        // Adding Customers
        
        manager.addCustomer(new Customer(1, "Alice", "aliceexample.com"));
        manager.addCustomer(new Customer(3, "Bob", "bobexample.com"));
        manager.addCustomer(new Customer(2, "Charlie", "charlieexample.com"));

        // Listing All Customers
        System.out.println("All Customers:");
        manager.listAllCustomers();

        // Searching for a Customer
        System.out.println("\nSearching for Customer with ID 2:");
        Customer customer = manager.searchCustomer(2);
        if (customer != null) {
            System.out.println(customer);
        } else {
            System.out.println("Customer not found.");
        }

        // Sorting Customers by Name
        System.out.println("\nSorting Customers by Name:");
        manager.sortCustomersByName();
        manager.listAllCustomers();

        // Sorting Customers by ID
        System.out.println("\nSorting Customers by ID:");
        manager.sortCustomersById();
        manager.listAllCustomers();

        // Removing a Customer
        System.out.println("\nRemoving Customer with ID 1:");
        boolean removed = manager.removeCustomer(1);
        if (removed) {
            System.out.println("Customer removed successfully.");
        } else {
            System.out.println("Customer not found.");
        }

        // Listing All Customers after Removal
        System.out.println("\nAll Customers after removal:");
        manager.listAllCustomers();
    }
  }
}


