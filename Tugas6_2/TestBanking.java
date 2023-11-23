package Tugas6_2;

public class TestBanking {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        bank.addCustomer("R", "Mochamad");
        bank.addCustomer("Irfan", "Kusuma");
        bank.addCustomer("Indrayana", "SI4604");
        bank.addCustomer("Erina", "Ma'rifah ");
        
        bank.getCustomer(0).getAccount().deposit(4604); 
        bank.getCustomer(1).getAccount().deposit(2220316);
        bank.getCustomer(3).getAccount().deposit(6846);
        
        bank.getCustomer(1).getAccount().withdraw(2220400);
        
        int numOfCustomers = bank.getNumOfCustomers();
        System.out.println("Jumlah Pelanggan: " + numOfCustomers);
        
        for (int i = 0; i < numOfCustomers; i++) {
            Customer customer = bank.getCustomer(i);
            System.out.println("Pelanggan " + (i + 1) +" "+ customer.getFirstName()+" "+customer.getLastName() +": " + customer.getAccount().getBalance());
        }
    }
}
