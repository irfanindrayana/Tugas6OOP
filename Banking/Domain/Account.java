package Banking.Domain;

public class Account {

	   protected double balance;
	    
	    

	    protected void setBalance(double balance) {
			this.balance = balance;
		}

		public Account(double initBalance) {
	        balance = initBalance;
	    }

	    public boolean deposit(double amt) {
	        balance += amt;
	        return true;
	    }

	    public boolean withdraw(double amt) {
	        if (amt <= balance) {
	            balance -= amt;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
}
