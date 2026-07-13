package Class_Task;

public class OddAndSumUsingWhileLoop {
    static void main() {
        int i = 1, sum = 0;
        while(i <= 20){
            if(i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;
            }
            i++;
        }
        System.out.println("\nSum is : "+sum);
    }
}
