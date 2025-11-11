import java.util.*;

class Account {
    private String accountNumber;
    private String name;
    private double balance;

    public Account(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        if (balance <= 0) {
            System.out.println("Initial balance must be greater than 0. Setting to 100 by default.");
            this.balance = 100;
        } else {
            this.balance = balance;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100) { // must keep at least 100
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or minimum balance (100) must be maintained!");
        }
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("------------------------");
    }
}

class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account added successfully!");
    }

    public void removeAccount(String accNo) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            accounts.remove(acc);
            System.out.println("Account removed successfully!");
        } else {
            System.out.println("Account not found!");
        }
    }

    public Account findAccount(String accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNo))
                return acc;
        }
        return null;
    }

    public void showAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account acc : accounts) {
                acc.displayInfo();
            }
        }
    }
}

public class BankATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;

        do {
            System.out.println("\n==== ATM MENU ====");
            System.out.println("1. Add Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show All Accounts");
            System.out.println("5. Remove Account");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNo = sc.next();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();
                    bank.addAccount(new Account(accNo, name, bal));
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    Account acc1 = bank.findAccount(accNo);
                    if (acc1 != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double amt = sc.nextDouble();
                        acc1.deposit(amt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    Account acc2 = bank.findAccount(accNo);
                    if (acc2 != null) {
                        System.out.print("Enter Withdraw Amount: ");
                        double amt = sc.nextDouble();
                        acc2.withdraw(amt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    bank.showAllAccounts();
                    break;

                case 5:
                    System.out.print("Enter Account Number to Remove: ");
                    accNo = sc.next();
                    bank.removeAccount(accNo);
                    break;

                case 6:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 6);
        sc.close();
    }
}
