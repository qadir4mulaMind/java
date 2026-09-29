package Loops;

import java.util.Scanner;

public class SumOfDigit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt(), count = 0, sum = 0;
        while(n != 0)
        {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        System.out.println("Sum of digit: " + sum);
    }
}