package Class_Task.Practice_Problem_01;

import java.util.*;

public class EvenOrOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.print("Even number");
        else
            System.out.println("Odd number");
    }
}
