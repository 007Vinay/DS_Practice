package Arrays;

public class SegregateZeroesAndOnes {
    public static void main(String[] args) {

        int[] arr = {0,1,0,1,0,1,0,0,0,1,1};

        int noz = 0;
        int noo = 0;
        for(int ele : arr){
            if(ele == 0){
                noz++;
            }else{
                noo++;
            }
        }

        //Fill Zeroes
        for(int i=0; i<noz; i++){
            arr[i]=0;
        }
        //Fill Ones
        for(int i=noz; i<arr.length; i++){
            arr[i] = 1;
        }

        //print Array
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
    }
}
