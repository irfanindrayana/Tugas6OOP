package Banking.Domain;

public class Bank {

	   private Customer[] customers;
	    private int numberOfCustomers;
	    private static final int MAX_CUSTOMERS = 7;
	    private static Bank instance = new Bank(); // Instance Singleton

	    private Bank() {
	        customers = new Customer[MAX_CUSTOMERS];
	        numberOfCustomers = 0;
	    }

	    public static Bank getBank() {
	        return instance;
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
