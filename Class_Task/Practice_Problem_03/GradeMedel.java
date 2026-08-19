package Class_Task.Practice_Problem_03;

import java.util.Scanner;

public class GradeMedel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your letter grade (CGPA) : ");
        double cgpa = sc.nextDouble();

        System.out.print("Have you completed the semester? : ");
        String completed = sc.next();

        if (completed.equalsIgnoreCase("yes")) {
            if (cgpa >= 3.5)
                System.out.println("Congratulation! You get a MEDEL.");
            else
                System.out.println("Semester completed, but grade is not enough for a medel.");
        } else
            System.out.println("You need to complete the semester first to be eligible for a medal.");
    }
}
