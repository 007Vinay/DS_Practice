package Arrays;

public class AddingTwoArraysOfVariableSize {
    public static int[] addArrays(int[] arr1, int[] arr2){
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;

        int[] result = new int[Math.max(arr1.length, arr2.length) + 1];
        int k = result.length-1;

        //Add Digits from right to left
        while(i>=0 || j>=0 || carry>0){
            int sum = carry;

            if(i>=0) sum+=arr1[i--];
            if(j>=0) sum+=arr2[j--];

            result[k--] = sum%10;
            carry = sum/10;

        }
        //Remove leading 0 if present
        if(result[0] == 0){
            int[] finalResult = new int[result.length-1];
            for(int x=1; x<result.length; x++){
                finalResult[x-1] = result[x];
            }
            return finalResult;
        }
        return result;
    }
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {9,9};

        int[] ans = addArrays(arr1, arr2);

        for(int num: ans){
            System.out.print(num + " ");
        }

    }
}
