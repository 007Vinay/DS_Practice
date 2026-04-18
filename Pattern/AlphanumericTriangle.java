package Pattern;

import java.util.Scanner;

public class AlphanumericTriangle {
    public static void main(String[] args) {

        //MIXED OF ALPHABET AND NUMERICAL VALUES
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%2!=0) System.out.print(j+" ");
                else System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}
