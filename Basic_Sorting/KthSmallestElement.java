package Basic_Sorting;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[]  arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};

        int k = 4;
        int n = arr.length;

        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.print(k+ "th smallest element is: "+ arr[k-1]);
    }
}
