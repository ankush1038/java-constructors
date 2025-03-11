import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number : ");
        String accountNumber = sc.nextLine();

        System.out.println("Enter Account Holder Name : ");
        String accountHolder = sc.nextLine();

        System.out.println("Enter Initial Balance : ");
        double balance = sc.nextDouble();

        // Creating a BankAccount object
        BankAccount account = new BankAccount(accountNumber, accountHolder, balance);

        // Displaying account details
        System.out.println("\n==== Account Details ====");
        account.displayAccountDetails();

        System.out.println("\nEnter Deposit Amount : ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.println("\nEnter Withdrawal Amount : ");
        double withdrawalAmount = sc.nextDouble();
        account.withdraw(withdrawalAmount);

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, accountHolder, balance);

        // Displaying SavingsAccount details
        System.out.println("\n==== Savings Account Details ====");
        savingsAccount.displaySavingsAccountDetails();

        sc.close();
    }
}

class BankAccount {
    public String accountNumber;

    protected String accountHolder;

    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful. New Balance : " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful. New Balance : " + balance);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displaySavingsAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
    }
}
