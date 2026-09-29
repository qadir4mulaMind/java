package recursion;

import java.util.Scanner;

public class OneToN {
    static int n;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        print(1);
    }

    public static void print(int x){
        if(x > n) return;
        System.out.print(x + " ");
        print(x + 1);
        if(x != n) System.out.print(x + " ");
    }
}