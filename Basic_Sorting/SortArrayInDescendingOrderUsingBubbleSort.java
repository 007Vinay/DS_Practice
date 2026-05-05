package Basic_Sorting;

public class SortArrayInDescendingOrderUsingBubbleSort {
    public static void main(String[] args) {
        int[] arr = {-2,3,5,1,4,2,0};

        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int swaps = 0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
