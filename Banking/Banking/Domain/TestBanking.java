package Banking.Domain;

import Banking.Reports.*;
//import java.util.*;

public class TestBanking {
//	   public static void main(String[] args) {
//
//	        CustomerReport report = new CustomerReport();
//	        report.generateReport();
//	    }
    public static void main(String[] args) {
        Bank bank = Bank.getBank();
        bank.addCustomer("Irfan", "Indrayana");
        bank.addCustomer("Putri", "Ma'rifah");

        Customer johnDoe = bank.getCustomer(0);
        johnDoe.addAccount(new CheckingAccount(6000000.0));
        johnDoe.addAccount(new SavingsAccount(5000000.0, 0.05));

        Customer janeDoe = bank.getCustomer(1);
        janeDoe.addAccount(new SavingsAccount(1566500.0, 0.03));

        CustomerReport report = new CustomerReport();
        report.generateReport();
    }
}
