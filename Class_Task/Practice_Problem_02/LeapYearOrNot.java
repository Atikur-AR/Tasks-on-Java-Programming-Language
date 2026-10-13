package Class_Task.Practice_Problem_02;

import java.util.Scanner;

public class LeapYearOrNot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0))
            System.out.println("Leap year");
        else
            System.out.println("Not leap year");

        sc.close();
        
    }
}
