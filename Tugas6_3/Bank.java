package Tugas6_3;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;
    private static final int MAX_CUSTOMERS = 7;

    
    
    public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public Bank() {
        customers = new Customer[MAX_CUSTOMERS];
        numberOfCustomers = 0;
    }

    public void addCustomer(String firstName, String lastName) {
        Customer newCustomer = new Customer(firstName, lastName);
        customers[numberOfCustomers] = newCustomer;
        numberOfCustomers++;
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        } else {
            return null;
        }
    }
}
