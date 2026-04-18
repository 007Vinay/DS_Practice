package Pattern;

import java.util.Scanner;

public class SameLetterAtEachLine {
    public static void main(String[] args) {

        //CAPITAL LETTER
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=4; j++){
//                System.out.print((char)(64+i)+" ");
//            }
//            System.out.println();
//        }

        //SMALL LETTER
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char)(96+i)+" ");
            }
            System.out.println();
        }
    }
}
