package Class_Task.Practice_Problem_01;

import java.util.Scanner;

public class VolumeOfBall {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double pi = 3.1416;

        double area = 4 / 3 * pi * radius * radius * radius;
        System.out.println("The volume is : " + area);

        sc.close();
    }
}
