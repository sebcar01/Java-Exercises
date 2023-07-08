import java.util.Scanner;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds() {
        boolean verification = false;

        do {

            System.out.println("Enter the amount you wish to deposit");
            double deposit = sc.nextDouble();

            if (deposit < 1) {

                System.out.println("The amount can't be negative or zero");

            } else {

                System.out.println("Amount successfully deposited!");
                balance += deposit;
                verification = true;

            }

        } while (!verification);

    }

    public void withdrawFunds(){
        boolean verification = false;

        do {

            System.out.println("Enter the amount you wish to withdraw");
            double withdraw = sc.nextDouble();

            if (balance - withdraw < 0) {

                System.out.println("The amount requested exceeds the balance!");

            } else {

                System.out.println("Amount successfully withdrawn!");
                verification = true;
                balance -= withdraw;

            }

        } while (!verification);

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
