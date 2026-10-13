package Class_Task.Practice_Problem_04;

class Wallet {
    double balance;

    Wallet(double balance) {
        this.balance = balance;
    }

    double deposit(double amount) {
        return balance += amount;
    }

    double withdraw(double amount) {
        System.out.println("Normal Withdrawal : " + amount);
        return balance -= amount;
    }

    double withdraw(double amount, String mode) {
        System.out.println("" + mode + " " + "Withdrawal : " + amount);
        return balance -= amount;
    }

    void showBalance() {
        System.out.println("Balance : " + balance);
    }
}

public class Wallet_04 {
    public static void main(String[] args) {
        Wallet w1 = new Wallet(500);
        w1.deposit(300);
        w1.withdraw(200);
        w1.withdraw(100, "ATM");
        w1.showBalance();
    }
}
