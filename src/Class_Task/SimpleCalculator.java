package Class_Task;
import java.util.Scanner;
public class SimpleCalculator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a : ");
        int a = sc.nextInt();

        System.out.print("Enter number b : ");
        int b = sc.nextInt();

        System.out.print("Enter operator : ");
        char ch = sc.next().charAt(0);

        if(ch == '+') System.out.println(a+b);
        else if(ch == '-') System.out.println(a-b);
        else if(ch == '*') System.out.println(a*b);
        else System.out.println(a/b);
    }
}
