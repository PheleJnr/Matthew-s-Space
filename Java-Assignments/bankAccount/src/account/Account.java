package account;

public class Account {
    private double balance;
    private int pin;

    public Account(int pin) {
        validatePin(pin);
        this.pin = pin;
    }

    private void validatePin(int pin) {
        if(pin < 1000 || pin > 9999)
            throw new IllegalArgumentException("Pin must be exactly 4 digits");
    }

    public double getBalance(int pin) {
        checkPin(pin);
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;

    }

    public void withdraw(double amount, int pin) {
        checkPin(pin);
        if (amount > 0 && balance >= amount)
            balance -= amount;
    }

    public void checkPin(int pin) {
        if (pin != this.pin)
            throw new IllegalArgumentException("The Pin you entered is incorrect");
    }

    public void changePin(int oldPin, int newPin) {
        checkPin(oldPin);
        validatePin(newPin);
        this.pin = newPin;
    }

}

