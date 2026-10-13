package Class_Task.Practice_Problem_01;

import java.util.Scanner;

public class GradeCalculate {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark : ");
        int mark = sc.nextInt();

        if (mark > 90)
            System.out.println("A+");
        else if (mark >= 80 && mark <= 89)
            System.out.println("A");
        else if (mark >= 70 && mark <= 79)
            System.out.println("A-");
        else if (mark >= 60 && mark <= 69)
            System.out.println("B");
        else if (mark >= 40 && mark <= 59)
            System.out.println("C+");
        else if (mark >= 0 && mark <= 30)
            System.out.println("F");

        sc.close();
    }
}
