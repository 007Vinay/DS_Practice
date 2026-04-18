package Arrays;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();

        }
            //Sum of elements
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        System.out.print("Sum of all elements: " + sum);

    }
}
