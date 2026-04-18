package Pattern;

import java.util.Scanner;

public class AlphabetShapes {


    public static void main(String[] args) {

        //FOR CAPITAL LETTERS (QUAD.)
        Scanner sc = new Scanner(System.in);
//
//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=4; j++){
//                System.out.print((char)(j+64)+" ");
//            }
//            System.out.println();
//        }


        //FOR SMALL LETTERS(QUAD.)
//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=26; j++){
//                System.out.print((char)(j+96)+" ");
//            }
//            System.out.println();
//        }

        //ALPHABET TRIANGLE (CAPITAL LETTERS)
//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print((char)(64+j)+" ");
//            }
//            System.out.println();
//        }

//        //ALPHABET ULTA TRIANGLE (SMALL LETTERS)
        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i+1; j++){
//                System.out.print((char)(j+96)+" ");
//            }
//            System.out.println();
//        }

        //ALPHABET TRIANGLE HORIZONTALLY FLIPPED
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i+1; j++){
                    System.out.print((char)(64+i)+" ");
                }
                System.out.println();
            }
    }
}
