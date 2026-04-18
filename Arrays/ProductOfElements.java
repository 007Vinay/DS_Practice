package Arrays;

import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int mult = 1;
            for(int i=0; i<n; i++){
                mult = mult * arr[i];
            }
        System.out.println("Product of Elements is: " + mult);
    }
}
