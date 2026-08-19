package Class_Task.Practice_Problem_03;

public class AverageOfStoreValues {
    public static void main(String[] args) {

        int[] values = { 10, 20, 30, 40, 50 };
        int n = values.length, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += values[i];
        }
        
        double avrg = sum / n;
        System.out.println("Average : " + avrg);
    }
}
