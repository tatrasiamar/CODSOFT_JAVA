import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank_Account userAccount = new Bank_Account(1000);
        ATM atm = new ATM(userAccount);

        Scanner sc = new Scanner(System.in);

        while (true) {
            atm.display_options();
            System.out.println("Enter your Choice:");
            int userChoice = sc.nextInt();

            atm.process_Options(userChoice);
        }
    }
}
