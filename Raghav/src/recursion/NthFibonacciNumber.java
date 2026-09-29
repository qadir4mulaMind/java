package recursion;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static int fibo(int n){
        return (n <= 1) ? n : fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter term: ");
        int n = input.nextInt();
        System.out.println("Ok!! the " + n + "Th fibanacci number is: " + fibo(n));
    }
}