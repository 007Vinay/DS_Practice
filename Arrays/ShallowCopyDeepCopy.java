package Arrays;
import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,10,20,40};
//        int[] x = arr;  //x is a shallow copy of arr
//        x[0] = 100;

        int[] y = Arrays.copyOf(arr, arr.length);  //deep copy
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);


    }
}
