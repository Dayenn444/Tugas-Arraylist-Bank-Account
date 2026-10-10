public class Account {
    private double balance;

    // Constructor yang menerima inisialisasi balance
    public Account(double init_balance) {
        this.balance = init_balance;
    }

    // Method untuk mengambil nilai balance saat ini
    public double getBalance() {
        return balance;
    }

    // Method untuk menambah saldo (deposit)
    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        }
        return false;
    }

    // Method untuk mengurangi saldo (withdraw)
    public boolean withdraw(double amt) {
        if (amt > 0 && balance >= amt) {
            balance -= amt;
            return true;
        }
        return false;
    }
}