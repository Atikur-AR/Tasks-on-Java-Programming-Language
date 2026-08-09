package Class_Task;

public class OddAndSumUsingDoWhileLoop {
    static void main() {
        int i = 1, sum = 0;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;

            }
            i++;
        } while (i <= 20);
        System.out.println("\nSum is : " + sum);
    }
}
