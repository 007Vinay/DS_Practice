package Basic_Sorting;

public class FindPairWithGivenSumUsingSelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,0,4,3,2,8,1,0};
        int n = arr.length;
        int target = 9;

        for(int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=i; j<n; j++){
              if(arr[j] < min){
                  min = arr[j];
                  mindx = j;
              }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("We got our target at index: "+ i+ " and "+ j);
                }
            }
        }
    }
}
