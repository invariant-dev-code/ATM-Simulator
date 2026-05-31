import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int correctPin = 2019;
        int attemps = 0;
        boolean blocked = false;

        double balance = 10000.00;

        ArrayList<String> transactionHistory = new ArrayList<>();

        // Authentication
        while (attemps < 3) {
            System.out.print("Enter your PIN: ");
            int enterPin = scn.nextInt();

            if (enterPin == correctPin) {
                System.out.println("Login successful!");
                break;
            } else {
                attemps++;
                System.out.println("Incorrect PIN! Attempt: " + attemps);
            }
        }
        // Block account
        if (attemps == 3) {
            blocked = true;
        }

        if (blocked) {
            System.out.println("Your account has been blocked!");
            scn.close();
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
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scn.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Current Balance: $" + balance);
                    break;
                }
                case 2: {
                    System.out.print("Enter deposit amount: ");
                    double deposit = scn.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Money deposited successfully!");
                        System.out.println("New Balance: $" + balance);
                    } else {
                        System.out.println("Invalid amount!");
                    }

                    break;
                }
                case 3: {
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scn.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid amount!");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful!");
                        System.out.println("New Balance: $" + balance);
                    }

                    break;
                }
                case 4: {
                    System.out.print("Enter current PIN: ");
                    int oldPin = scn.nextInt();

                    if (oldPin == correctPin) {

                        System.out.print("Enter new PIN: ");
                        int newPin = scn.nextInt();

                        correctPin = newPin;

                        transactionHistory.add(
                                "PIN changed"
                        );

                        System.out.println("PIN changed successfully!");

                    } else {
                        System.out.println("Incorrect current PIN!");
                    }

                    break;
                }
                case 5: {
                    System.out.println("Thank you for using ATM.");
                    break;
                }
                default:
                    System.out.println("Invalid choice!");
            }


        } while (choice != 4);
    }
}
