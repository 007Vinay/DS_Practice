package Arrays;

import java.util.Scanner;

public class SecondMaxElement {
    public static void main(String[] args) {

        int[] arr = {4, 10,10,8};
        int n = arr.length;

        //int max = arr[0];  or we can use
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        //calculate max
        for(int i=0; i<n; i++){
            if(arr[i]>max) max =arr[i];
        }
        //calculate second max
        for(int i=0; i<n; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.println("Second max element is:"+ smax);

    }
}
