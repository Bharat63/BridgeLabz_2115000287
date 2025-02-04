import java.util.Scanner;

class BankAccountSystem {
    static String bankName = "XYZ Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;
    double balance;

    BankAccountSystem(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccountSystem) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }
}

public class BankAccountSystemMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        int accNumber = scanner.nextInt();
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();
        BankAccountSystem account = new BankAccountSystem(name, accNumber, balance);
        account.displayDetails();
        BankAccountSystem.getTotalAccounts();
        scanner.close();
    }
}
