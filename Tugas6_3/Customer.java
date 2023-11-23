package Tugas6_3;
import java.util.*;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts;
    
    protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	protected String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        } else {
            return null;
        }
    }

    public int getNumOfAccounts() {
        return accounts.size();
    }

}

