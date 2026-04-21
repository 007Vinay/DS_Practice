package Merge_Sort;

public class CountInversion {
    public static void main(String[] args) {

        int[] arr = {5,2,8,4,1,6,7,3};

        int result = countInversions(arr);
        System.out.print(result);
    }

    public static int countInversions(int[] arr){
        int n = arr.length;
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }   //THIS CODE IS CORRECT BUT IT WILL GIVE US ERROR: TIME LIMIT EXCEEDED
}
