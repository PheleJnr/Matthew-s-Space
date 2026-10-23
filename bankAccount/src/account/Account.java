package account;

public class Account {
    private double balance;
    private String pin;

    public Account(String pin) {
        validatePin(pin);
        this.pin = pin;
    }

    private void validatePin(String pin) {
        if(pin == null || !pin.matches("\\d{4}"))
            throw new IllegalArgumentException("Pin must be exactly 4 digits");
    }

    public double getBalance(String pin) {
        checkPin(pin);
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;

    }

    public void withdraw(double amount, String pin) {
        checkPin(pin);
        if (amount > 0 && balance >= amount)
            balance -= amount;
    }

    public void checkPin(String pin) {
        if (!this.pin.equals(pin))
            throw new IllegalArgumentException("The Pin you entered is incorrect");
    }

    public void changePin(String oldPin, String newPin) {
        checkPin(oldPin);
        validatePin(newPin);
        this.pin = newPin;
    }

}

