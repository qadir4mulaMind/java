package recursion;

public class TOH {
    public static void main(String[] args) {
        honoi(5, 'A', 'B', 'C');
    }

    private  static void honoi(int n, char src, char helper, char dest){
        if(n == 0) return;
        // n - 1 disk from A to B via C
        honoi(n - 1, src, dest, helper);
        // largest from A to C
        System.out.println(src + " -> " + dest);
        // n - 1 disk from B to C via A
        honoi(n - 1, helper, src, dest);
    }
}