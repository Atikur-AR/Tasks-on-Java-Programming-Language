package Class_Task.Practice_Problem_04;

class Wallet {
    static int id;
    int balance;

    Wallet() {
    this(0);
    }

    Wallet(int amount) {
    balance = amount;
    id++;
    }

    void BalanceShow() {
    System.out.println("ID : " + id + "\nBalance : " + balance);
    }
    }

public class Wallet_03 {
    public static void main(String[] args) {
        Wallet w1 = new Wallet(800);
         w1.BalanceShow();

         Wallet w2 = new Wallet(1500);
         w2.BalanceShow();
    }
}
