package Arrays;

import java.util.Arrays;
import java.util.ArrayList;

public class AddingOneByArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9,9,9));
        int n = arr.size();
        int carry = 1;

        for(int i=n-1; i>=0; i--){
            int sum = arr.get(i) + carry;
            arr.set(i, sum%10);
            carry = sum/10;
        }

        if(carry>0){
            arr.add(0, carry);
        }
        System.out.println(arr);
    }
}
