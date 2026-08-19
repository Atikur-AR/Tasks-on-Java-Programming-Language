package Class_Task.Practice_Problem_01;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter celsius scale : ");
        double celsius = sc.nextDouble();

        double F = ((celsius * 9) / 5) + 32;
        System.out.println("The fehrenheit scale is : " + F);
    }
}
