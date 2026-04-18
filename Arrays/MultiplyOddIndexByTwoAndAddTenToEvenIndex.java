package Arrays;

import java.util.Scanner;

public class MultiplyOddIndexByTwoAndAddTenToEvenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){

            if(i%2 != 0){  //for odd index
                arr[i] = arr[i]*2;
            }

            if(i%2 == 0){   //for even index
                arr[i] = arr[i]+10;
            }
            System.out.println(arr[i]);
        }

    }
}
