package Basic_Sorting;

import java.util.ArrayList;
import java.util.Arrays;


public class UnionOfTwoArrays {
    public static void main(String[] args) {
    int[]a = {3,1,2,1,1,4,5,5};
    int[]b = {6,1,1,4,4,2,8};
    Arrays.sort(a);
    Arrays.sort(b);

    ArrayList<Integer> union = new ArrayList<>();
    for(int num:a){
        if(!union.contains(num)){
            union.add(num);
        }
    }
    for(int num:b){
        if(!union.contains(num)){
            union.add(num);
        }
    }
        System.out.println(union);
    }
}
