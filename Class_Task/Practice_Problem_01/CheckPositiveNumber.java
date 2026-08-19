package Class_Task.Practice_Problem_01;

import java.util.Scanner;

public class CheckPositiveNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num > 0)
            System.out.println("Positive number");
        else
            System.out.println("Negative number");

    }
}
