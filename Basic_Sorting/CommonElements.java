package Basic_Sorting;

import java.util.Arrays;

import static java.lang.Math.min;

public class CommonElements {
    public static void main(String[] args) {

        int[]a = {3,1,2,1,1,4,5,5};
        int[]b = {6,1,1,4,4,2,8};
        Arrays.sort(a);
        Arrays.sort(b);
        int n = min(a.length, b.length);

        int[] ans = new int[n];

        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                ans[k] = a[i];
                i++;
                j++;
                k++;
            }else if(a[i]<b[j]){
                i++;
            }else{
                j++;
            }
        }
        for(int x=0; x<k; x++){
            System.out.print(ans[x]+" ");
        }
    }
}
