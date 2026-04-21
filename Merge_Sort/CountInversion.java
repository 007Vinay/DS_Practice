package Merge_Sort;

public class CountInversion {
    static int count;
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 4, 1, 6, 7, 3};

        count = 0;
        mergeSort(arr);

        System.out.println(count);

    }
    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n<=1) return;

        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        int idx=0;
        for(int i=0; i<a.length; i++) a[i] = arr[idx++];
        for(int i=0; i<b.length; i++) b[i] = arr[idx++];

        mergeSort(a);
        mergeSort(b);

        merge(a,b,arr);
    }

    public static void merge(int[] a, int[] b, int[] c) {

        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]) c[k++] = a[i++];

            else{
                c[k++] = b[j++];
                count += (a.length-i);
            }
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
}
