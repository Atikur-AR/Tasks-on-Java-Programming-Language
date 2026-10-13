package Class_Task.Practice_Problem_04;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        char[] arr = sc.nextLine().toCharArray();

         for(int i=0, j = arr.length-1; i<j; i++, j--){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
         }

         System.out.println("Reverse String : "+ new String(arr));

         sc.close();
    }
    
}
