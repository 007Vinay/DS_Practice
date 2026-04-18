package Recursion;

import java.util.ArrayList;

public class StringBasicsMore {
    public static void main(String[] args) {
        String s = "Kartikey";
        change(s);
        System.out.println(s);

        String[] arr = {"Santosh", "Krish","Hemant","Preet"};

        ArrayList<String> al = new ArrayList<>();
        al.add("Shravani");
        al.add("Umang");
        al.add("Ayan");
        al.add("Shelly");
        al.add("Riya");
        System.out.print(al);
        change2(al);
        System.out.println(al);
    }

    private static void change2(ArrayList<String> al) {
        al.add("Biplab");
    }

    private static void change(String s) {
        s="lavish";
    }
}
