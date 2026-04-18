package Strings;

import java.util.ArrayList;

public class StringBuilders {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder(6);
        System.out.println(s.length()+" "+ s.capacity());
        System.out.println(s);
        s.append("Raghav");
        System.out.println(s);
        s.setCharAt(1,'o');
        System.out.println(s);
        String t = s.toString();
        System.out.println(t);
        s.append("634678339876546382fgdhs");
        System.out.println(s);
        System.out.println(s.length()+" "+ s.capacity());
    }
}
