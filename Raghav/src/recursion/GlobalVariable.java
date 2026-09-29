package recursion;

public class GlobalVariable {
    static int x = 10;

    public static void main(String[] args) {
        System.out.println(x);
        fun();
        System.out.println(x);
    }

    public static void fun(){
        x = 20;
    }
}