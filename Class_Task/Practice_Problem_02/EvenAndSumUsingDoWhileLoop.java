package Class_Task.Practice_Problem_02;

public class EvenAndSumUsingDoWhileLoop {
    static void main() {
        int i = 2, sum = 0;
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;

            }
            i++;
        } while (i <= 20);
        System.out.println("\nSum is : " + sum);
    }
}
