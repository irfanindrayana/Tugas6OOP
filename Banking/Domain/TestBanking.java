package Banking.Domain;

public class TestBanking {

//	public TestBanking() {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
        Bank bank = Bank.getBank();
        bank.addCustomer("Irfan", "Indrayana");
        bank.addCustomer("Putri", "Ma'rifah");

        Customer johnDoe = bank.getCustomer(0);
        johnDoe.addAccount(new CheckingAccount(500.0));
        johnDoe.addAccount(new SavingsAccount(2000.0, 0.05));

        Customer janeDoe = bank.getCustomer(1);
        janeDoe.addAccount(new SavingsAccount(1500.0, 0.03));

        CustomerReport report = new CustomerReport();
        report.generateReport();
	}

}
