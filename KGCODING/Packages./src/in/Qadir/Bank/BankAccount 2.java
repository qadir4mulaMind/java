package in.Qadir.Bank;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid deposit!");
        } else {
            balance += money;
        }
    }

    public double withdrawMoney(double money) {
        if (money > balance) {
            System.out.println("You have not enough balance.");
        } else {
            balance -= money;
        }
        return money;
    }

    public double getBalance() {
        return balance;
    }
}