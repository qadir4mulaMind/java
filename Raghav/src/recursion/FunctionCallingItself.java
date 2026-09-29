package recursion;

public class FunctionCallingItself {
    public static void ajay(int n) {
        if(n == 10) return;
        System.out.println("Priya");
        ajay(n + 1);
    }

    public static void print(int n){
        if(n < 1) return;
        System.out.print(n + " ");
        print(--n);
    }

    public static void print2(int n, int x){
        if(x > n) return;
        System.out.print(x + " ");
        print2(n, ++x);
    }

    public static void print3(int n){
        if(n < 1) return;
        print3(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        // ajay(1);
        // print(10);
        // print2(20, 4);
        print3(9);
    }
}