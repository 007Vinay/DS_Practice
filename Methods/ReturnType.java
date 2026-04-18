package Methods;

public class ReturnType {
//    public static int prasun(){
//        System.out.println("banu");
//        System.out.println("Nanda");
//        return 5;   //khatam
////        System.out.println("Unreachable sttmnt");
//    }
//
//    public static void main(String[] args) {
//    //prasun();    //standalone call lagayi bas
//        int x = prasun();
////      System.out.println(3+prasun());
//        System.out.println(3+x);
//    }


public static int prasun(int a){
    System.out.println("banu");
    if(a>0) return 5;
    else return 10;
}

    public static void main(String[] args) {

        int x = prasun(7);
        System.out.println(3+x);

    }
}
