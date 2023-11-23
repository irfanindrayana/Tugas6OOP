package Banking.Reports;


import Banking.Domain.*;
import Banking.Domain.Account;

import java.util.*;

public class CustomerReport {
	   public void generateReport() {
	        Bank bank = Bank.getBank(); 

	        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
	            Customer customer = bank.getCustomer(i);
	            String fullName = customer.getFirstName() + " " + customer.getLastName();

	            for (int j = 0; j < customer.getNumOfAccounts(); j++) {
	                Account acc = customer.getAccount(j);
	                String accountType = acc instanceof SavingsAccount ? "Savings Account" :
	                                     acc instanceof CheckingAccount ? "Checking Account" : "Unknown Account Type";

	                java.text.NumberFormat currencyFormat = java.text.NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
	                System.out.println(fullName + " Account Type: " + accountType + "\t Balance: " + currencyFormat.format(acc.getBalance()));
	                // System.out.println("ada ngk");
	            }
	        }
	        
	        
	    }
	   
	    public static void main(String[] args) {
	        CustomerReport customerReport = new CustomerReport();
	        customerReport.generateReport();
	    }
}
