package Class_Task;

import java.util.Scanner;

public class AreaOfCircle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double radius = sc.nextDouble();
        double pi = 3.1416;

        double area = pi * radius * radius;
        System.out.println("The area is : " + area);
    }
}
