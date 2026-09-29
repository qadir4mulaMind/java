package ConditionalStatement;

import java.util.Scanner;

public class DivisibleBy5or3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        if(n % 3 == 0 || n % 5 == 0) System.out.println("Divisible by 5 or 3");
        else System.out.println("Not divisible by 5 or 3");
    }
}