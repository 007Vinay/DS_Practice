package MultiDimensional_Array;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> spirallyTraverse(int[][] arr){
            ArrayList<Integer> ans = new ArrayList<>();
            int m=arr.length, n=arr[0].length;
            int fr=0, lr=m-1, fc=0, lc=n-1;
            int tne=m*n;
            while(ans.size()<tne){
                //Right
                for(int j=fc; j<=lc; j++)
                    ans.add(arr[fr][j]);
                    fr++;
                    if(ans.size()==tne) break;

                //down
                for(int i=fr; i<=lr; i++)
                    ans.add(arr[i][lc]);
                    lc--;
                    if(ans.size()==tne) break;

                //left
                for(int j=lc; j>=fc; j--)
                    ans.add(arr[lr][j]);
                    lr--;
                    if(ans.size()==tne) break;

                //up
                for(int i=lr; i>=fr; i--)
                    ans.add(arr[i][fc]);
                fc++;

            }
            return ans;






//    public ArrayList<Integer> spirallyTraverse(int[][] arr){
//        ArrayList<Integer> ans = new ArrayList<>();
//        int m=arr.length, n=arr[0].length;
//        int fr=0, lr=m-1, fc=0, lc=n-1;
//        while(fr<=lr && fc<=lc){
//            //Right
//            for(int j=fc; j<=lc; j++){
//                ans.add(arr[fr][j]);
//                fr++;
//                if(fr>lr || fc>lc) break;
//            }
//            //down
//            for(int i=fr; i<=lr; i++){
//                ans.add(arr[i][lc]);
//                lc--;
//                if(fr>lr || fc>lc) break;
//            }
//            //left
//            for(int j=lc; j>=fc; j--){
//                ans.add(arr[lr][j]);
//                lr--;
//                if(fr>lr || fc>lc) break;
//            }
//            //up
//            for(int i=lr; i>=fr; i--){
//                ans.add(arr[i][fc]);
//                fc++;
//                if(fr>lr || fc>lc) break;
//            }
//        }
//        return ans;
    }
}
