package Strings;

public class ReverseStringBuilder {
    public static void main(String[] args) {
//        String s = "Devesh";
//        StringBuilder sb = new StringBuilder(s);
        //sb.reverse();
//        int i=0, j=sb.length()-1;
//        while(i<=j){
//            char temp1 = sb.charAt(i);
//            char temp2 = sb.charAt(j);
//            sb.setCharAt(i, temp2);
//            sb.setCharAt(j,temp1);
//            i++;
//            j--;
//        }

//        sb.deleteCharAt(1);
//        sb.insert(1, 'a');
//        sb.delete(3,6);
//        System.out.println(sb);

        String s = "Aditya";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        System.out.println(sb);


    }
}
