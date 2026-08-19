package Class_Task.Practice_Problem_02;

public class OddAndSumUsingForLoop {
    static void main() {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nSum is : " + sum);
    }
}
