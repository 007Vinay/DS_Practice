package MultiDimensional_Array;

import java.util.Scanner;

public class OutputIn2DArray {
    public static void main(String[] args) {
//        int[][] arr = {{2,9,5},{8,1,6},{3,4,7}};
//        System.out.println(arr[2][1]);

/*
        int[][] arr = {{6,0,2,7},{1,3,7,2},{9,9,4,5}};
        System.out.println(arr.length+" "+ arr[0].length);
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

 */
        int[][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);



        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        }
    }
