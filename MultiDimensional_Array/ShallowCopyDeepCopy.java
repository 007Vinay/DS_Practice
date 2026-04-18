package MultiDimensional_Array;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7},{1,3,7,2},{9,9,4,5}};
        int[][] brr = {{6,0,2,7},{1,3,7,2},{9,9,4,5}};
        brr[1][3]=20;
    }
}
