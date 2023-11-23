package Tugas6_3;

import java.util.*;

public class TestBanking {
	   public static void main(String[] args) {
	        Customer customer1 = new Customer("Irfan", "Kusuma");
	        SavingsAccount savings1 = new SavingsAccount(500000000, 0.05);
	        CheckingAccount checking1 = new CheckingAccount(2000000);
	        customer1.addAccount(savings1);
	        customer1.addAccount(checking1);
	        
	        Customer customer2 = new Customer("Rifah", "Nurhasan");
	        SavingsAccount savings2 = new SavingsAccount(950000000, 0.05);
	        CheckingAccount checking2 = new CheckingAccount(289550000);
	        customer2.addAccount(checking2);
	        customer2.addAccount(savings2);
	         

	        for (int i = 0; i < customer1.getNumOfAccounts(); i++) {
	            Account acc = customer1.getAccount(i);
	            String account_type;
	            if (acc instanceof SavingsAccount) {
	                account_type = "Savings Account";
	            } else if (acc instanceof CheckingAccount) {
	                account_type = "Checking Account";
	            } else {
	                account_type = "Unknown Account Type";
	            }

	            java.text.NumberFormat currency_format = java.text.NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
	            System.out.println(customer1.getFirstName() + " "+ customer1.getLastName()+ " Tipe akun : " + account_type + "\t Balance: " + currency_format.format(acc.getBalance()));
	        }
	        
	        for (int i = 0; i < customer1.getNumOfAccounts(); i++) {
	            Account acc = customer2.getAccount(i);
	            String account_type;
	            if (acc instanceof SavingsAccount) {
	                account_type = "Savings Account";
	            } else if (acc instanceof CheckingAccount) {
	                account_type = "Checking Account";
	            } else {
	                account_type = "Unknown Account Type";
	            }

	            java.text.NumberFormat currency_format = java.text.NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
	            System.out.println(customer2.getFirstName() + " "+ customer2.getLastName()+ " Tipe akun : " + account_type + "\t Balance: " + currency_format.format(acc.getBalance()));
	        }
	    }
}
