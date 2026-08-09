package Class_Task;

import java.util.Scanner;

public class AreaOfTriangle2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arm a : ");
        double a = sc.nextDouble();

        System.out.print("Enter arm b : ");
        double b = sc.nextDouble();

        System.out.print("Enter arm c : ");
        double c = sc.nextDouble();

        double s = (a + b + c) / 2;

        double area = (Math.pow((s * (s - a) * (s - b) * (s - c)), 0.5));
        System.out.println("The area is : " + area);
    }
}
