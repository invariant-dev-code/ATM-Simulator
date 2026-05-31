import java.util.ArrayList;

public class Account {
    private int pin;
    private double balance;
    private boolean blocked;

    private ArrayList<String> transactiopnHistory = new ArrayList<>();

    public Account(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
        this.blocked = false;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public ArrayList<String> getTransactiopnHistory() {
        return transactiopnHistory;
    }

    public void setTransactiopnHistory(ArrayList<String> transactiopnHistory) {
        this.transactiopnHistory = transactiopnHistory;
    }

    public void deposit(double amount) {
        balance += amount;

        transactiopnHistory.add(
                "Deposited: " + amount + "$"
        );
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            return;
        }
        balance -= amount;

        transactiopnHistory.add(
                "Withdrawn:" + amount + "$"
        );
    }

    public void changePin(int newPin) {
        pin = newPin;

        transactiopnHistory.add(
                "Pin changed"
        );
    }
}
