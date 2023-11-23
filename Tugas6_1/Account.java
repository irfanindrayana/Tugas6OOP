package Tugas6_1;

public class Account {
    private double balance;

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
