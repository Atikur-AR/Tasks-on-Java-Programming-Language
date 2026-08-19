package Class_Task.Practice_Problem_04;

public class Wallet_01 {
    static double deposit(double balance, double amount) {
        return balance + amount;
    }

    static double withdraw(double balance, double amount) {
        return balance - amount;
    }

    public static void main(String[] args) {
        double balance_1 = 500, balance_2 = 800;

        balance_1 = deposit(balance_1, 200);
        balance_1 = withdraw(balance_1, 400);

        System.out.println("Wallet 1 balance : " + balance_1);

        balance_2 = deposit(balance_2, 200);
        balance_2 = withdraw(balance_2, 400);

        System.out.println("Wallet 2 balance : " + balance_2);
    }
}
