import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Account account = new Account(1234, 1000);

        int attemps = 0;

        ArrayList<String> transactionHistory = new ArrayList<>();

        // Authentication
        while (attemps < 3) {
            System.out.print("Enter your PIN: ");
            int enterPin = scn.nextInt();

            if (enterPin == account.getPin()) {
                System.out.println("Login successful!");
                break;
            } else {
                attemps++;
                System.out.println("Incorrect PIN! Attempt: " + attemps);
            }
        }
        // Block account
        if (attemps == 3) {
            account.setBlocked(true);
            System.out.println("Your account has been blocked!");
            return;
        }

        System.out.println("Login succesful");

        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scn.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Balance: " + account.getBalance() + "$");
                    break;
                }
                case 2: {
                    System.out.print("Enter deposit amount: ");
                    double deposit = scn.nextDouble();

                    account.deposit(deposit);
                    System.out.println("Money deposited successfully!");
                    break;
                }
                case 3: {
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scn.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid amount!");
                    } else if (withdraw > account.getBalance()) {
                        System.out.println("Insufficient balance!");
                    } else {
                        account.withdraw(withdraw);
                    }
                    break;
                }
                case 4: {
                    System.out.print("Enter current PIN: ");
                    int oldPin = scn.nextInt();

                    if (oldPin == account.getPin()) {

                        System.out.print("Enter new PIN: ");
                        int newPin = scn.nextInt();

                        account.changePin(newPin);

                        System.out.println("PIN changed successfully!");

                    } else {
                        System.out.println("Incorrect current PIN!");
                    }

                    break;
                }
                case 5: {
                    if (account.getTransactiopnHistory().isEmpty()) {
                        System.out.println("No transaction found.");
                    } else {
                        System.out.println("\n===== TRANSACTION HISTORY =====");
                        for (String history : account.getTransactiopnHistory()) {
                            System.out.println(history);
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("Thank you for using ATM.");
                    break;
                }
                default:
                    System.out.println("Invalid choice!");
            }


        } while (choice != 6);
    }
}
