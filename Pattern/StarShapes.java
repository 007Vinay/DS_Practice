package Pattern;


import java.util.Scanner;

public class StarShapes {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
//        System.out.println("Enter rows: ");
//        int row = sc.nextInt();
//        System.out.println("Enter cols ");
//        int col = sc.nextInt();
//
//        for(int i=1; i<=row; i++){
//            for(int j=1; j<=col; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //RIGHT ANGLED TRIANGLE
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //RIGHT ANGLED TRIANGLE (ULTA)
//        for(int i=4; i>=1; i--){
//            for(int j=i; j>=1; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //RIGHT ANGLED TRIANGLE (ULTA)
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
