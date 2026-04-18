package Methods;

public class PassByValueAndPassByReference {
    public static void change(int x){
        System.out.println(x);
        x =10;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        change(x);
        System.out.println(x);;

    }
}
