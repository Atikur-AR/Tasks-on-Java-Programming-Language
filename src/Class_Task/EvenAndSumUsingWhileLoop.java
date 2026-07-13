package Class_Task;

public class EvenAndSumUsingWhileLoop {
    static void main() {
        int i = 2, sum = 0;
        while(i <= 20){
            if(i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
        }
            i++;
    }
        System.out.println("\nSum is : "+sum);
        }
}
