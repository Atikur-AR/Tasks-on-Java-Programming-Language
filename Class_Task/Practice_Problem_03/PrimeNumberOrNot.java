package Class_Task.Practice_Problem_03;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int f = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n < 2) {
                f = 0;
                break;
            }
            if (n % i == 0) {
                f = 0;
                break;
            }
        }
        if (f == 1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

        sc.close();
    }
}
