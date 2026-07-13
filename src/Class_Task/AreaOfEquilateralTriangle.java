package Class_Task;
import java.util.Scanner;
public class AreaOfEquilateralTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arm : ");
        double arm = sc.nextDouble();

        double area = ((Math.pow(3,0.5)/4)*arm*arm);
        System.out.println("The area is : "+area);
    }
}
