package Banking.Domain;

public class SavingsAccount extends Account {
    private double interestRate;

    protected void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public SavingsAccount(double balance, double interest_rate) {
        super(balance);
        this.interestRate = interest_rate;
    }

    public double getInterestRate() {
        return interestRate;
    }

}
