package Class_Task.Practice_Problem_04;

class Wallet {
    double balance;

    Wallet(double amount) {
        balance = amount;
    }

    double deposite(double amount) {
        return balance += amount;
    }

    double withdraw(double amount) {
        return balance -= amount;
    }

    void show() {
        System.out.println("Balance : " + balance);
    }
}

public class Wallet_02 {
    public static void main(String[] args) {
        Wallet w1 = new Wallet(1000);

        w1.deposite(500);
        w1.withdraw(700);
        w1.show();

    }
}
