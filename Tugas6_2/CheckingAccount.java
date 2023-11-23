package Tugas6_2;

class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }

    public CheckingAccount(double balance) {
        this(balance, 0);
    }

    public boolean withdraw(double amt) {
        if (amt <= getBalance()) {
            setBalance(getBalance() - amt);
            return true;
        } else {
            double kurang = amt - getBalance();
            if (kurang <= overdraftProtection) {
                setBalance(0);
                overdraftProtection -= kurang;
                return false;
            } else {
                return false;
            }
        }
    }

}
