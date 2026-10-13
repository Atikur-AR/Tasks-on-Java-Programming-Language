package Class_Task.Practice_Problem_03;

import java.util.Scanner;

public class BonusCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Target sales percentage : ");
        double sales = sc.nextDouble();

        System.out.print("Attendence percentage : ");
        double attendence = sc.nextDouble();

        int bonus;
        if (sales >= 95 && attendence >= 100)
            bonus = 60;
        else if (sales >= 95 && attendence >= 90)
            bonus = 40;
        else if (sales >= 80 && attendence >= 100)
            bonus = 40;
        else if (sales >= 80 && attendence >= 90)
            bonus = 20;
        else
            bonus = 5;

        System.out.println("Bonus : " + bonus + "%");

        sc.close();
    }
}
