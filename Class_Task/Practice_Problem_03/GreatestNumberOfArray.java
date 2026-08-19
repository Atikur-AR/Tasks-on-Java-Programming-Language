package Class_Task.Practice_Problem_03;

public class GreatestNumberOfArray {
    public static void main(String[] args) {

        int[] arr = { 3, 9, 0, 8, 6 };
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > m)
                m = arr[i];
        }
        System.out.println("Greatest : " + m);
    }
}
