package Strings;

public class SumOfSubstringOfANumber {
    public static void main(String[] args) {

        String s = "1234";

        int sum=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                sum=sum+ Integer.parseInt(s.substring(i,j));
            }

        }
        System.out.println("Total sum os substrings is: "+ sum);

    }
}
