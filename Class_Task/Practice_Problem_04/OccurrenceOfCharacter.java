package Class_Task.Practice_Problem_04;

import java.util.Scanner;

public class OccurrenceOfCharacter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        char[] arr = sc.nextLine().toCharArray();

        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ch) count++;
        }

        System.out.println("Occurrence of "+ch+" "+": "+count);

        sc.close();
    }
}
