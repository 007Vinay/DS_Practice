package Strings;

public class SubstringsOfString {
    public static void main(String[] args) {
//        String s = "Jaishankar";
//        System.out.println(s.substring(3));
//        System.out.println(s.substring(3,7)); //3 to 6
//        System.out.println(s.substring(1, s.length()-1));


        String s = "gopi";

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                System.out.print(s.substring(i, j)+" ");
            }
            System.out.println();
        }

    }
}


