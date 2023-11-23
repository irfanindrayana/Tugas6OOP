package Tugas6_1;

public class TestBanking {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        bank.addCustomer("R", "Mochamad");
        bank.addCustomer("Irfan", "Kusuma");
        bank.addCustomer("Indrayana", "1202220316");
        
        bank.getCustomer(0).getAccount().deposit(4604); 
        bank.getCustomer(1).getAccount().deposit(316);
        
        bank.getCustomer(0).getAccount().withdraw(4605); 
        
        int numOfCustomers = bank.getNumOfCustomers();
        System.out.println("Jumlah Pelanggan: " + numOfCustomers);
        
        for (int i = 0; i < numOfCustomers; i++) {
            Customer customer = bank.getCustomer(i);
            System.out.println("Pelanggan " + (i + 1) + ": " + customer.getAccount().getBalance());
        }
    }
}
