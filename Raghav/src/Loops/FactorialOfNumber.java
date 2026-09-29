package Loops;

import java.util.Scanner;

public class FactorialOfNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt(), fact = 1;
        for(int i = 1; i <= n; i++) fact *= i;
        System.out.println("The factorial of " + n + " is " + fact);
    }
}