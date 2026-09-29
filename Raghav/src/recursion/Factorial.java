package recursion;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int x){
        if(x < 1) return 1;
        return x * factorial(x - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number to calculate the factorial of number: ");
        int n = input.nextInt();
        System.out.println("Ok!! the factorial of " + n + " is: " + factorial(n));
    }
}