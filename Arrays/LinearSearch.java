package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 3,27,53,18,62,88,6};
        int target = 18;

        int found = -1; //-1 means target array me nhi hai
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                found = i; // anyno. except -1 means target array me hai
                break;
            }
        }
        if (found!=-1) System.out.println("Target exist in array at index "+ found);
        else System.out.println("Target is missing in array");



    }
}
