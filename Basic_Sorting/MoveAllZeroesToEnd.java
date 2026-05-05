package Basic_Sorting;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,2};

        int n = arr.length;

        /*  int j=0; //Position for next non-zero
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }*/


        //Using Bubble Sort
        for(int i=0; i<n-1; i++){
            int swaps = 0;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]==0 && arr[j+1]!=0){
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
