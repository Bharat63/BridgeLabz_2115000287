class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer, String accountNumber, double balance) {
        customer.setAccount(new Account(this, accountNumber, balance));
    }
}

class Account {
    Bank bank;
    String accountNumber;
    double balance;

    Account(Bank bank, String accountNumber, double balance) {
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountDetails() {
        System.out.println("Bank: " + bank.name + ", Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}

class Customer {
    String name;
    Account account;

    Customer(String name) {
        this.name = name;
    }

    void setAccount(Account account) {
        this.account = account;
    }

    void viewBalance() {
        if (account != null) {
            account.displayAccountDetails();
        } else {
            System.out.println(name + " has no account.");
        }
    }
}

public class BankAndAccountHolder {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bank.openAccount(customer1, "123456", 5000.00);
        bank.openAccount(customer2, "789012", 3000.50);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}
