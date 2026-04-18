package Basic_Sorting;

public class SelectionSortByFindingLargestElement {
    public static void main(String[] args) {
        int[] arr = {8,4,1,9,-3,6,5};

        int n = arr.length;

        for(int i=n-1; i>=0; i--){
            int max=Integer.MIN_VALUE;
            int maxdx=-1;

            for(int j=0; j<=i; j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxdx];
            arr[maxdx]=temp;
        }

        for(int ele:arr) {
            System.out.print(ele+" ");
        }

    }
}
