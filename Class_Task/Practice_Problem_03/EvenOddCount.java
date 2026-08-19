package Class_Task.Practice_Problem_03;

public class EvenOddCount {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 7, 9, 4, 22, 45 };
        int countEven = 0, countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                countEven++;
            else
                countOdd++;
        }
        System.out.println("Even number : " + countEven);
        System.out.println("Odd number : " + countOdd);
    }
}
