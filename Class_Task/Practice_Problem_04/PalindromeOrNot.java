package Class_Task.Practice_Problem_04;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        char[] arr = sc.nextLine().toCharArray();

        int f = 1;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                f = 0;
                break;
            }
        }

        if (f == 1)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
