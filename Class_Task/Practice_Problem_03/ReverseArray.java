package Class_Task.Practice_Problem_03;

public class ReverseArray {
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
