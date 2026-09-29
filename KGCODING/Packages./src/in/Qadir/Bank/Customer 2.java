package in.Qadir.Bank;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "Abdul Qadir");

        account.depositMoney(1000);
        account.withdrawMoney(1200); // Should fail
        account.withdrawMoney(500);  // Should succeed

        System.out.println("Balance: ₹" + account.getBalance());
    }
}