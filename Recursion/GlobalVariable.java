package Recursion;

public class GlobalVariable {
    static int x =10;
    public static void main(String[] args) {
        // fun();
        x=9;  //change
        System.out.println(x);
        x=4;
        System.out.println(x);
        x=6;
    }

    public static void fun() {
        x=20;
    }
}
