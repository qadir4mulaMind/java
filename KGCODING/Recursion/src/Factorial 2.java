import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial generator.");
        System.out.print("Please enter number: ");
        int num = input.nextInt();
        System.out.println("The factorial of " + num + " is " + factorial(num));
    }
    public static int factorial(int n)
    {
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
}