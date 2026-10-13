package Class_Task.Practice_Problem_04;

class Wallet {
    double balance;

    Wallet(double balance) {
        this.balance = balance;
    }

    double addBonus(Wallet w, double amount) {
        return w.balance += amount;
    }
}

public class Wallet_05 {

    static void swap(Wallet w1, Wallet w2) {
        Wallet temp = w1;
        w1 = w2;
        w2 = temp;
    }

    public static void main(String[] args) {
        Wallet w1 = new Wallet(1000);
        Wallet w2 = new Wallet(2000);
        w1.addBonus(w1, 300);
        w2.addBonus(w2, 400);

        System.out.println("W1 balance : " + w1.balance);
        System.out.println("W2 balance : " + w2.balance);

        swap(w1,w2);

        System.out.println("After Swapping two Wallet");

        System.out.println("W1 balance : "+w1.balance);
        System.out.println("W2 balance : "+w2.balance);
    }
}
