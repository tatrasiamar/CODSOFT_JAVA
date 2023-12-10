import java.util.Scanner;

public class Bank_Account {
    private double balance;

    public Bank_Account(double initial_balance) {
        this.balance = initial_balance;
    }

    public double getbalance() {
        return balance;
    }

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance is: " + balance);
        } else {
            System.out.println("Invalid Deposit Amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance is: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

class ATM {
    private Bank_Account user_Account;

    public ATM(Bank_Account user_Account) {
        this.user_Account = user_Account;
    }

    public void display_options() {
        System.out.println("\n ATM options:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void process_Options(int option) {
        Scanner sc = new Scanner(System.in);

        switch (option) {
            case 1:
                System.out.println("Current Balance: " + user_Account.getbalance());
                break;

            case 2:
                System.out.println("Enter Deposit amount:");
                double deposit_amount = sc.nextDouble();
                user_Account.deposite(deposit_amount);
                break;

            case 3:
                System.out.println("Enter Withdrawal Amount:");
                double withdrawal_amount = sc.nextDouble();
                user_Account.withdraw(withdrawal_amount);
                break;

            case 4:
                System.out.println("Exit. Thank you");
                System.exit(0); // Exit the program
                break;

            default:
                System.out.println("Invalid option. Please choose the correct option");
                break;
        }
    }
}

